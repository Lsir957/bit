/**
 * gridstack.js 0.3.0
 * http://troolee.github.io/gridstack.js/
 * (c) 2014-2016 Pavel Reznikov, Dylan Weiss
 * gridstack.js may be freely distributed under the MIT license.
 * @preserve
*/
!function(a){if("function"==typeof define&&define.amd)define(["jquery","lodash"],a);else if("undefined"!=typeof exports){try{jQuery=require("jquery")}catch(a){}try{_=require("lodash")}catch(a){}a(jQuery,_)}else a(jQuery,_)}(function(a,b){function c(a){this.grid=a}var d=window,e=function(a,b,c){var d=function(){return console.warn("gridstack.js: Function `"+b+"` is deprecated as of v0.2.5 and has been replaced with `"+c+"`. It will be **completely** removed in v1.0."),a.apply(this,arguments)};return d.prototype=a.prototype,d},f=function(a,b){console.warn("gridstack.js: Option `"+a+"` is deprecated as of v0.2.5 and has been replaced with `"+b+"`. It will be **completely** removed in v1.0.")},g={isIntercepted:function(a,b){return!(a.x+a.width<=b.x||b.x+b.width<=a.x||a.y+a.height<=b.y||b.y+b.height<=a.y)},sort:function(a,c,d){return d=d||b.chain(a).map(function(a){return a.x+a.width}).max().value(),c=-1!=c?1:-1,b.sortBy(a,function(a){return c*(a.x+a.y*d)})},createStylesheet:function(a){var b=document.createElement("style");return b.setAttribute("type","text/css"),b.setAttribute("data-gs-style-id",a),b.styleSheet?b.styleSheet.cssText="":b.appendChild(document.createTextNode("")),document.getElementsByTagName("head")[0].appendChild(b),b.sheet},removeStylesheet:function(b){a("STYLE[data-gs-style-id="+b+"]").remove()},insertCSSRule:function(a,b,c,d){"function"==typeof a.insertRule?a.insertRule(b+"{"+c+"}",d):"function"==typeof a.addRule&&a.addRule(b,c,d)},toBool:function(a){return"boolean"==typeof a?a:"string"==typeof a?!(""===(a=a.toLowerCase())||"no"==a||"false"==a||"0"==a):Boolean(a)},_collisionNodeCheck:function(a){return a!=this.node&&g.isIntercepted(a,this.nn)},_didCollide:function(a){return g.isIntercepted({x:this.n.x,y:this.newY,width:this.n.width,height:this.n.height},a)},_isAddNodeIntercepted:function(a){return g.isIntercepted({x:this.x,y:this.y,width:this.node.width,height:this.node.height},a)},parseHeight:function(a){var c=a,d="px";if(c&&b.isString(c)){var e=c.match(/^(-[0-9]+\.[0-9]+|[0-9]*\.[0-9]+|-[0-9]+|[0-9]+)(px|em|rem|vh|vw)?$/);if(!e)throw new Error("Invalid height");d=e[2]||"px",c=parseFloat(e[1])}return{height:c,unit:d}}};g.is_intercepted=e(g.isIntercepted,"is_intercepted","isIntercepted"),g.create_stylesheet=e(g.createStylesheet,"create_stylesheet","createStylesheet"),g.remove_stylesheet=e(g.removeStylesheet,"remove_stylesheet","removeStylesheet"),g.insert_css_rule=e(g.insertCSSRule,"insert_css_rule","insertCSSRule"),c.registeredPlugins=[],c.registerPlugin=function(a){c.registeredPlugins.push(a)},c.prototype.resizable=function(a,b){return this},c.prototype.draggable=function(a,b){return this},c.prototype.droppable=function(a,b){return this},c.prototype.isDroppable=function(a){return!1},c.prototype.on=function(a,b,c){return this};var h=0,i=function(a,b,c,d,e){this.width=a,this.float=c||!1,this.height=d||0,this.nodes=e||[],this.onchange=b||function(){},this._updateCounter=0,this._float=this.float,this._addedNodes=[],this._removedNodes=[]};i.prototype.batchUpdate=function(){this._updateCounter=1,this.float=!0},i.prototype.commit=function(){0!==this._updateCounter&&(this._updateCounter=0,this.float=this._float,this._packNodes(),this._notify())},i.prototype.getNodeDataByDOMEl=function(a){return b.find(this.nodes,function(b){return a.get(0)===b.el.get(0)})},i.prototype._fixCollisions=function(a){this._sortNodes(-1);var c=a,d=Boolean(b.find(this.nodes,function(a){return a.locked}));for(this.float||d||(c={x:0,y:a.y,width:this.width,height:a.height});;){var e=b.find(this.nodes,b.bind(g._collisionNodeCheck,{node:a,nn:c}));if(void 0===e)return;this.moveNode(e,e.x,a.y+a.height,e.width,e.height,!0)}},i.prototype.isAreaEmpty=function(a,c,d,e){var f={x:a||0,y:c||0,width:d||1,height:e||1},h=b.find(this.nodes,b.bind(function(a){return g.isIntercepted(a,f)},this));return null===h||void 0===h},i.prototype._sortNodes=function(a){this.nodes=g.sort(this.nodes,a,this.width)},i.prototype._packNodes=function(){this._sortNodes(),this.float?b.each(this.nodes,b.bind(function(a,c){if(!a._updating&&void 0!==a._origY&&a.y!=a._origY)for(var d=a.y;d>=a._origY;){var e=b.chain(this.nodes).find(b.bind(g._didCollide,{n:a,newY:d})).value();e||(a._dirty=!0,a.y=d),--d}},this)):b.each(this.nodes,b.bind(function(a,c){if(!a.locked)for(;a.y>0;){var d=a.y-1,e=0===c;if(c>0){var f=b.chain(this.nodes).take(c).find(b.bind(g._didCollide,{n:a,newY:d})).value();e=void 0===f}if(!e)break;a._dirty=a.y!=d,a.y=d}},this))},i.prototype._prepareNode=function(a,c){return a=b.defaults(a||{},{width:1,height:1,x:0,y:0}),a.x=parseInt(""+a.x),a.y=parseInt(""+a.y),a.width=parseInt(""+a.width),a.height=parseInt(""+a.height),a.autoPosition=a.autoPosition||!1,a.noResize=a.noResize||!1,a.noMove=a.noMove||!1,a.width>this.width?a.width=this.width:a.width<1&&(a.width=1),a.height<1&&(a.height=1),a.x<0&&(a.x=0),a.x+a.width>this.width&&(c?a.width=this.width-a.x:a.x=this.width-a.width),a.y<0&&(a.y=0),a},i.prototype._notify=function(){var a=Array.prototype.slice.call(arguments,0);if(a[0]=void 0===a[0]?[]:[a[0]],a[1]=void 0===a[1]||a[1],!this._updateCounter){var b=a[0].concat(this.getDirtyNodes());this.onchange(b,a[1])}},i.prototype.cleanNodes=function(){this._updateCounter||b.each(this.nodes,function(a){a._dirty=!1})},i.prototype.getDirtyNodes=function(){return b.filter(this.nodes,function(a){return a._dirty})},i.prototype.addNode=function(a,c){if(a=this._prepareNode(a),void 0!==a.maxWidth&&(a.width=Math.min(a.width,a.maxWidth)),void 0!==a.maxHeight&&(a.height=Math.min(a.height,a.maxHeight)),void 0!==a.minWidth&&(a.width=Math.max(a.width,a.minWidth)),void 0!==a.minHeight&&(a.height=Math.max(a.height,a.minHeight)),a._id=++h,a._dirty=!0,a.autoPosition){this._sortNodes();for(var d=0;;++d){var e=d%this.width,f=Math.floor(d/this.width);if(!(e+a.width>this.width)&&!b.find(this.nodes,b.bind(g._isAddNodeIntercepted,{x:e,y:f,node:a}))){a.x=e,a.y=f;break}}}return this.nodes.push(a),void 0!==c&&c&&this._addedNodes.push(b.clone(a)),this._fixCollisions(a),this._packNodes(),this._notify(),a},i.prototype.removeNode=function(a,c){c=void 0===c||c,this._removedNodes.push(b.clone(a)),a._id=null,this.nodes=b.without(this.nodes,a),this._packNodes(),this._notify(a,c)},i.prototype.canMoveNode=function(c,d,e,f,g){if(!this.isNodeChangedPosition(c,d,e,f,g))return!1;var h=Boolean(b.find(this.nodes,function(a){return a.locked}));if(!this.height&&!h)return!0;var j,k=new i(this.width,null,this.float,0,b.map(this.nodes,function(b){return b==c?j=a.extend({},b):a.extend({},b)}));if(void 0===j)return!0;k.moveNode(j,d,e,f,g);var l=!0;return h&&(l&=!Boolean(b.find(k.nodes,function(a){return a!=j&&Boolean(a.locked)&&Boolean(a._dirty)}))),this.height&&(l&=k.getGridHeight()<=this.height),l},i.prototype.canBePlacedWithRespectToHeight=function(c){if(!this.height)return!0;var d=new i(this.width,null,this.float,0,b.map(this.nodes,function(b){return a.extend({},b)}));return d.addNode(c),d.getGridHeight()<=this.height},i.prototype.isNodeChangedPosition=function(a,b,c,d,e){return"number"!=typeof b&&(b=a.x),"number"!=typeof c&&(c=a.y),"number"!=typeof d&&(d=a.width),"number"!=typeof e&&(e=a.height),void 0!==a.maxWidth&&(d=Math.min(d,a.maxWidth)),void 0!==a.maxHeight&&(e=Math.min(e,a.maxHeight)),void 0!==a.minWidth&&(d=Math.max(d,a.minWidth)),void 0!==a.minHeight&&(e=Math.max(e,a.minHeight)),a.x!=b||a.y!=c||a.width!=d||a.height!=e},i.prototype.moveNode=function(a,b,c,d,e,f){if(!this.isNodeChangedPosition(a,b,c,d,e))return a;if("number"!=typeof b&&(b=a.x),"number"!=typeof c&&(c=a.y),"number"!=typeof d&&(d=a.width),"number"!=typeof e&&(e=a.height),void 0!==a.maxWidth&&(d=Math.min(d,a.maxWidth)),void 0!==a.maxHeight&&(e=Math.min(e,a.maxHeight)),void 0!==a.minWidth&&(d=Math.max(d,a.minWidth)),void 0!==a.minHeight&&(e=Math.max(e,a.minHeight)),a.x==b&&a.y==c&&a.width==d&&a.height==e)return a;var g=a.width!=d;return a._dirty=!0,a.x=b,a.y=c,a.width=d,a.height=e,a.lastTriedX=b,a.lastTriedY=c,a.lastTriedWidth=d,a.lastTriedHeight=e,a=this._prepareNode(a,g),this._fixCollisions(a),f||(this._packNodes(),this._notify()),a},i.prototype.getGridHeight=function(){return b.reduce(this.nodes,function(a,b){return Math.max(a,b.y+b.height)},0)},i.prototype.beginUpdate=function(a){b.each(this.nodes,function(a){a._origY=a.y}),a._updating=!0},i.prototype.endUpdate=function(){b.each(this.nodes,function(a){a._origY=a.y});var a=b.find(this.nodes,function(a){return a._updating});a&&(a._updating=!1)};var j=function(d,e){var g,h,j=this;e=e||{},this.container=a(d),void 0!==e.handle_class&&(e.handleClass=e.handle_class,f("handle_class","handleClass")),void 0!==e.item_class&&(e.itemClass=e.item_class,f("item_class","itemClass")),void 0!==e.placeholder_class&&(e.placeholderClass=e.placeholder_class,f("placeholder_class","placeholderClass")),void 0!==e.placeholder_text&&(e.placeholderText=e.placeholder_text,f("placeholder_text","placeholderText")),void 0!==e.cell_height&&(e.cellHeight=e.cell_height,f("cell_height","cellHeight")),void 0!==e.vertical_margin&&(e.verticalMargin=e.vertical_margin,f("vertical_margin","verticalMargin")),void 0!==e.min_width&&(e.minWidth=e.min_width,f("min_width","minWidth")),void 0!==e.static_grid&&(e.staticGrid=e.static_grid,f("static_grid","staticGrid")),void 0!==e.is_nested&&(e.isNested=e.is_nested,f("is_nested","isNested")),void 0!==e.always_show_resize_handle&&(e.alwaysShowResizeHandle=e.always_show_resize_handle,f("always_show_resize_handle","alwaysShowResizeHandle")),e.itemClass=e.itemClass||"grid-stack-item";var k=this.container.closest("."+e.itemClass).length>0;if(this.opts=b.defaults(e||{},{width:parseInt(this.container.attr("data-gs-width"))||12,height:parseInt(this.container.attr("data-gs-height"))||0,itemClass:"grid-stack-item",placeholderClass:"grid-stack-placeholder",placeholderText:"",handle:".grid-stack-item-content",handleClass:null,cellHeight:60,verticalMargin:20,auto:!0,minWidth:768,float:!1,staticGrid:!1,_class:"grid-stack-instance-"+(1e4*Math.random()).toFixed(0),animate:Boolean(this.container.attr("data-gs-animate"))||!1,alwaysShowResizeHandle:e.alwaysShowResizeHandle||!1,resizable:b.defaults(e.resizable||{},{autoHide:!e.alwaysShowResizeHandle,handles:"se"}),draggable:b.defaults(e.draggable||{},{handle:(e.handleClass?"."+e.handleClass:e.handle?e.handle:"")||".grid-stack-item-content",scroll:!1,appendTo:"body"}),disableDrag:e.disableDrag||!1,disableResize:e.disableResize||!1,rtl:"auto",removable:!1,removeTimeout:2e3,verticalMarginUnit:"px",cellHeightUnit:"px",disableOneColumnMode:e.disableOneColumnMode||!1,oneColumnModeClass:e.oneColumnModeClass||"grid-stack-one-column-mode",ddPlugin:null}),!1===this.opts.ddPlugin?this.opts.ddPlugin=c:null===this.opts.ddPlugin&&(this.opts.ddPlugin=b.first(c.registeredPlugins)||c),this.dd=new this.opts.ddPlugin(this),"auto"===this.opts.rtl&&(this.opts.rtl="rtl"===this.container.css("direction")),this.opts.rtl&&this.container.addClass("grid-stack-rtl"),this.opts.isNested=k,h="auto"===this.opts.cellHeight,h?j.cellHeight(j.cellWidth(),!0):this.cellHeight(this.opts.cellHeight,!0),this.verticalMargin(this.opts.verticalMargin,!0),this.container.addClass(this.opts._class),this._setStaticClass(),k&&this.container.addClass("grid-stack-nested"),this._initStyles(),this.grid=new i(this.opts.width,function(a,c){c=void 0===c||c;var d=0;b.each(a,function(a){c&&null===a._id?a.el&&a.el.remove():(a.el.attr("data-gs-x",a.x).attr("data-gs-y",a.y).attr("data-gs-width",a.width).attr("data-gs-height",a.height),d=Math.max(d,a.y+a.height))}),j._updateStyles(d+10)},this.opts.float,this.opts.height),this.opts.auto){var l=[],m=this;this.container.children("."+this.opts.itemClass+":not(."+this.opts.placeholderClass+")").each(function(b,c){c=a(c),l.push({el:c,i:parseInt(c.attr("data-gs-x"))+parseInt(c.attr("data-gs-y"))*m.opts.width})}),b.chain(l).sortBy(function(a){return a.i}).each(function(a){j._prepareElement(a.el)}).value()}if(this.setAnimation(this.opts.animate),this.placeholder=a('<div class="'+this.opts.placeholderClass+" "+this.opts.itemClass+'"><div class="placeholder-content">'+this.opts.placeholderText+"</div></div>").hide(),this._updateContainerHeight(),this._updateHeightsOnResize=b.throttle(function(){j.cellHeight(j.cellWidth(),!1)},100),this.onResizeHandler=function(){if(h&&j._updateHeightsOnResize(),j._isOneColumnMode()&&!j.opts.disableOneColumnMode){if(g)return;j.container.addClass(j.opts.oneColumnModeClass),g=!0,j.grid._sortNodes(),b.each(j.grid.nodes,function(a){j.container.append(a.el),j.opts.staticGrid||(j.dd.draggable(a.el,"disable"),j.dd.resizable(a.el,"disable"),a.el.trigger("resize"))})}else{if(!g)return;if(j.container.removeClass(j.opts.oneColumnModeClass),g=!1,j.opts.staticGrid)return;b.each(j.grid.nodes,function(a){a.noMove||j.opts.disableDrag||j.dd.draggable(a.el,"enable"),a.noResize||j.opts.disableResize||j.dd.resizable(a.el,"enable"),a.el.trigger("resize")})}},a(window).resize(this.onResizeHandler),this.onResizeHandler(),!j.opts.staticGrid&&"string"==typeof j.opts.removable){var n=a(j.opts.removable);this.dd.isDroppable(n)||this.dd.droppable(n,{accept:"."+j.opts.itemClass}),this.dd.on(n,"dropover",function(b,c){var d=a(c.draggable);d.data("_gridstack_node")._grid===j&&j._setupRemovingTimeout(d)}).on(n,"dropout",function(b,c){var d=a(c.draggable);d.data("_gridstack_node")._grid===j&&j._clearRemovingTimeout(d)})}if(!j.opts.staticGrid&&j.opts.acceptWidgets){var o=null,p=function(a,b){var c=o,d=c.data("_gridstack_node"),e=j.getCellFromPixel(b.offset,!0),f=Math.max(0,e.x),g=Math.max(0,e.y);if(d._added){if(!j.grid.canMoveNode(d,f,g))return;j.grid.moveNode(d,f,g),j._updateContainerHeight()}else d._added=!0,d.el=c,d.x=f,d.y=g,j.grid.cleanNodes(),j.grid.beginUpdate(d),j.grid.addNode(d),j.container.append(j.placeholder),j.placeholder.attr("data-gs-x",d.x).attr("data-gs-y",d.y).attr("data-gs-width",d.width).attr("data-gs-height",d.height).show(),d.el=j.placeholder,d._beforeDragX=d.x,d._beforeDragY=d.y,j._updateContainerHeight()};this.dd.droppable(j.container,{accept:function(b){b=a(b);var c=b.data("_gridstack_node");return(!c||c._grid!==j)&&b.is(!0===j.opts.acceptWidgets?".grid-stack-item":j.opts.acceptWidgets)}}).on(j.container,"dropover",function(b,c){var d=(j.container.offset(),a(c.draggable)),e=j.cellWidth(),f=j.cellHeight(),g=d.data("_gridstack_node"),h=g?g.width:Math.ceil(d.outerWidth()/e),i=g?g.height:Math.ceil(d.outerHeight()/f);o=d;var k=j.grid._prepareNode({width:h,height:i,_added:!1,_temporary:!0});d.data("_gridstack_node",k),d.data("_gridstack_node_orig",g),d.on("drag",p)}).on(j.container,"dropout",function(b,c){var d=a(c.draggable);d.unbind("drag",p);var e=d.data("_gridstack_node");e.el=null,j.grid.removeNode(e),j.placeholder.detach(),j._updateContainerHeight(),d.data("_gridstack_node",d.data("_gridstack_node_orig"))}).on(j.container,"drop",function(b,c){j.placeholder.detach();var d=a(c.draggable).data("_gridstack_node");d._grid=j;var e=a(c.draggable).clone(!1);e.data("_gridstack_node",d);var f=a(c.draggable).data("_gridstack_node_orig");void 0!==f&&f._grid._triggerRemoveEvent(),a(c.draggable).remove(),d.el=e,j.placeholder.hide(),e.attr("data-gs-x",d.x).attr("data-gs-y",d.y).attr("data-gs-width",d.width).attr("data-gs-height",d.height).addClass(j.opts.itemClass).removeAttr("style").enableSelection().removeData("draggable").removeClass("ui-draggable ui-draggable-dragging ui-draggable-disabled").unbind("drag",p),j.container.append(e),j._prepareElementsByNode(e,d),j._updateContainerHeight(),j.grid._addedNodes.push(d),j._triggerAddEvent(),j._triggerChangeEvent(),j.grid.endUpdate()})}};return j.prototype._triggerChangeEvent=function(a){var b=this.grid.getDirtyNodes(),c=!1,d=[];b&&b.length&&(d.push(b),c=!0),(c||!0===a)&&this.container.trigger("change",d)},j.prototype._triggerAddEvent=function(){this.grid._addedNodes&&this.grid._addedNodes.length>0&&(this.container.trigger("added",[b.map(this.grid._addedNodes,b.clone)]),this.grid._addedNodes=[])},j.prototype._triggerRemoveEvent=function(){this.grid._removedNodes&&this.grid._removedNodes.length>0&&(this.container.trigger("removed",[b.map(this.grid._removedNodes,b.clone)]),this.grid._removedNodes=[])},j.prototype._initStyles=function(){this._stylesId&&g.removeStylesheet(this._stylesId),this._stylesId="gridstack-style-"+(1e5*Math.random()).toFixed(),this._styles=g.createStylesheet(this._stylesId),null!==this._styles&&(this._styles._max=0)},j.prototype._updateStyles=function(a){if(null!==this._styles&&void 0!==this._styles){var b,c="."+this.opts._class+" ."+this.opts.itemClass,d=this;if(void 0===a&&(a=this._styles._max),this._initStyles(),this._updateContainerHeight(),this.opts.cellHeight&&!(0!==this._styles._max&&a<=this._styles._max)&&(b=this.opts.verticalMargin&&this.opts.cellHeightUnit!==this.opts.verticalMarginUnit?function(a,b){return a&&b?"calc("+(d.opts.cellHeight*a+d.opts.cellHeightUnit)+" + "+(d.opts.verticalMargin*b+d.opts.verticalMarginUnit)+")":d.opts.cellHeight*a+d.opts.verticalMargin*b+d.opts.cellHeightUnit}:function(a,b){return d.opts.cellHeight*a+d.opts.verticalMargin*b+d.opts.cellHeightUnit},0===this._styles._max&&g.insertCSSRule(this._styles,c,"min-height: "+b(1,0)+";",0),a>this._styles._max)){for(var e=this._styles._max;e<a;++e)g.insertCSSRule(this._styles,c+'[data-gs-height="'+(e+1)+'"]',"height: "+b(e+1,e)+";",e),g.insertCSSRule(this._styles,c+'[data-gs-min-height="'+(e+1)+'"]',"min-height: "+b(e+1,e)+";",e),g.insertCSSRule(this._styles,c+'[data-gs-max-height="'+(e+1)+'"]',"max-height: "+b(e+1,e)+";",e),g.insertCSSRule(this._styles,c+'[data-gs-y="'+e+'"]',"top: "+b(e,e)+";",e);this._styles._max=a}}},j.prototype._updateContainerHeight=function(){if(!this.grid._updateCounter){var a=this.grid.getGridHeight();this.container.attr("data-gs-current-height",a),this.opts.cellHeight&&(this.opts.verticalMargin?this.opts.cellHeightUnit===this.opts.verticalMarginUnit?this.container.css("height",a*(this.opts.cellHeight+this.opts.verticalMargin)-this.opts.verticalMargin+this.opts.cellHeightUnit):this.container.css("height","calc("+(a*this.opts.cellHeight+this.opts.cellHeightUnit)+" + "+(a*(this.opts.verticalMargin-1)+this.opts.verticalMarginUnit)+")"):this.container.css("height",a*this.opts.cellHeight+this.opts.cellHeightUnit))}},j.prototype._isOneColumnMode=function(){return(window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth)<=this.opts.minWidth},j.prototype._setupRemovingTimeout=function(b){var c=this,d=a(b).data("_gridstack_node");!d._removeTimeout&&c.opts.removable&&(d._removeTimeout=setTimeout(function(){b.addClass("grid-stack-item-removing"),d._isAboutToRemove=!0},c.opts.removeTimeout))},j.prototype._clearRemovingTimeout=function(b){var c=a(b).data("_gridstack_node");c._removeTimeout&&(clearTimeout(c._removeTimeout),c._removeTimeout=null,b.removeClass("grid-stack-item-removing"),c._isAboutToRemove=!1)},j.prototype._prepareElementsByNode=function(b,c){var d,e,f=this,g=function(a,g){var h,i,j=Math.round(g.position.left/d),k=Math.floor((g.position.top+e/2)/e);if("drag"!=a.type&&(h=Math.round(g.size.width/d),i=Math.round(g.size.height/e)),"drag"==a.type)j<0||j>=f.grid.width||k<0||!f.grid.float&&k>f.grid.getGridHeight()?c._temporaryRemoved||(!0===f.opts.removable&&f._setupRemovingTimeout(b),j=c._beforeDragX,k=c._beforeDragY,f.placeholder.detach(),f.placeholder.hide(),f.grid.removeNode(c),f._updateContainerHeight(),c._temporaryRemoved=!0):(f._clearRemovingTimeout(b),c._temporaryRemoved&&(f.grid.addNode(c),f.placeholder.attr("data-gs-x",j).attr("data-gs-y",k).attr("data-gs-width",h).attr("data-gs-height",i).show(),f.container.append(f.placeholder),c.el=f.placeholder,c._temporaryRemoved=!1));else if("resize"==a.type&&j<0)return;var l=void 0!==h?h:c.lastTriedWidth,m=void 0!==i?i:c.lastTriedHeight;!f.grid.canMoveNode(c,j,k,h,i)||c.lastTriedX===j&&c.lastTriedY===k&&c.lastTriedWidth===l&&c.lastTriedHeight===m||(c.lastTriedX=j,c.lastTriedY=k,c.lastTriedWidth=h,c.lastTriedHeight=i,f.grid.moveNode(c,j,k,h,i),f._updateContainerHeight())},h=function(g,h){f.container.append(f.placeholder);var i=a(this);f.grid.cleanNodes(),f.grid.beginUpdate(c),d=f.cellWidth();var j=Math.ceil(i.outerHeight()/i.attr("data-gs-height"));e=f.container.height()/parseInt(f.container.attr("data-gs-current-height")),f.placeholder.attr("data-gs-x",i.attr("data-gs-x")).attr("data-gs-y",i.attr("data-gs-y")).attr("data-gs-width",i.attr("data-gs-width")).attr("data-gs-height",i.attr("data-gs-height")).show(),c.el=f.placeholder,c._beforeDragX=c.x,c._beforeDragY=c.y,f.dd.resizable(b,"option","minWidth",d*(c.minWidth||1)),f.dd.resizable(b,"option","minHeight",j*(c.minHeight||1)),"resizestart"==g.type&&i.find(".grid-stack-item").trigger("resizestart")},i=function(d,e){var g=a(this);if(g.data("_gridstack_node")){var h=!1;if(f.placeholder.detach(),c.el=g,f.placeholder.hide(),c._isAboutToRemove){h=!0;b.data("_gridstack_node")._grid._triggerRemoveEvent(),b.removeData("_gridstack_node"),b.remove()}else f._clearRemovingTimeout(b),c._temporaryRemoved?(g.attr("data-gs-x",c._beforeDragX).attr("data-gs-y",c._beforeDragY).attr("data-gs-width",c.width).attr("data-gs-height",c.height).removeAttr("style"),c.x=c._beforeDragX,c.y=c._beforeDragY,f.grid.addNode(c)):g.attr("data-gs-x",c.x).attr("data-gs-y",c.y).attr("data-gs-width",c.width).attr("data-gs-height",c.height).removeAttr("style");f._updateContainerHeight(),f._triggerChangeEvent(h),f.grid.endUpdate();var i=g.find(".grid-stack");i.length&&"resizestop"==d.type&&(i.each(function(b,c){a(c).data("gridstack").onResizeHandler()}),g.find(".grid-stack-item").trigger("resizestop"),g.find(".grid-stack-item").trigger("gsresizestop")),"resizestop"==d.type&&f.container.trigger("gsresizestop",g)}};this.dd.draggable(b,{start:h,stop:i,drag:g}).resizable(b,{start:h,stop:i,resize:g}),(c.noMove||this._isOneColumnMode()&&!f.opts.disableOneColumnMode||this.opts.disableDrag)&&this.dd.draggable(b,"disable"),(c.noResize||this._isOneColumnMode()&&!f.opts.disableOneColumnMode||this.opts.disableResize)&&this.dd.resizable(b,"disable"),b.attr("data-gs-locked",c.locked?"yes":null)},j.prototype._prepareElement=function(b,c){c=void 0!==c&&c;var d=this;b=a(b),b.addClass(this.opts.itemClass);var e=d.grid.addNode({x:b.attr("data-gs-x"),y:b.attr("data-gs-y"),width:b.attr("data-gs-width"),height:b.attr("data-gs-height"),maxWidth:b.attr("data-gs-max-width"),minWidth:b.attr("data-gs-min-width"),maxHeight:b.attr("data-gs-max-height"),minHeight:b.attr("data-gs-min-height"),autoPosition:g.toBool(b.attr("data-gs-auto-position")),noResize:g.toBool(b.attr("data-gs-no-resize")),noMove:g.toBool(b.attr("data-gs-no-move")),locked:g.toBool(b.attr("data-gs-locked")),el:b,id:b.attr("data-gs-id"),_grid:d},c);b.data("_gridstack_node",e),this._prepareElementsByNode(b,e)},j.prototype.setAnimation=function(a){a?this.container.addClass("grid-stack-animate"):this.container.removeClass("grid-stack-animate")},j.prototype.addWidget=function(b,c,d,e,f,g,h,i,j,k,l){return b=a(b),void 0!==c&&b.attr("data-gs-x",c),void 0!==d&&b.attr("data-gs-y",d),void 0!==e&&b.attr("data-gs-width",e),void 0!==f&&b.attr("data-gs-height",f),void 0!==g&&b.attr("data-gs-auto-position",g?"yes":null),void 0!==h&&b.attr("data-gs-min-width",h),void 0!==i&&b.attr("data-gs-max-width",i),void 0!==j&&b.attr("data-gs-min-height",j),void 0!==k&&b.attr("data-gs-max-height",k),void 0!==l&&b.attr("data-gs-id",l),this.container.append(b),this._prepareElement(b,!0),this._triggerAddEvent(),this._updateContainerHeight(),this._triggerChangeEvent(!0),b},j.prototype.makeWidget=function(b){return b=a(b),this._prepareElement(b,!0),this._triggerAddEvent(),this._updateContainerHeight(),this._triggerChangeEvent(!0),b},j.prototype.willItFit=function(a,b,c,d,e){var f={x:a,y:b,width:c,height:d,autoPosition:e};return this.grid.canBePlacedWithRespectToHeight(f)},j.prototype.removeWidget=function(b,c){c=void 0===c||c,b=a(b);var d=b.data("_gridstack_node");d||(d=this.grid.getNodeDataByDOMEl(b)),this.grid.removeNode(d,c),b.removeData("_gridstack_node"),this._updateContainerHeight(),c&&b.remove(),this._triggerChangeEvent(!0),this._triggerRemoveEvent()},j.prototype.removeAll=function(a){b.each(this.grid.nodes,b.bind(function(b){this.removeWidget(b.el,a)},this)),this.grid.nodes=[],this._updateContainerHeight()},j.prototype.destroy=function(b){a(window).off("resize",this.onResizeHandler),this.disable(),void 0===b||b?this.container.remove():(this.removeAll(!1),this.container.removeData("gridstack")),g.removeStylesheet(this._stylesId),this.grid&&(this.grid=null)},j.prototype.resizable=function(b,c){var d=this;return b=a(b),b.each(function(b,e){e=a(e);var f=e.data("_gridstack_node");void 0!==f&&null!==f&&(f.noResize=!c,f.noResize||d._isOneColumnMode()&&!d.opts.disableOneColumnMode?d.dd.resizable(e,"disable"):d.dd.resizable(e,"enable"))}),this},j.prototype.movable=function(b,c){var d=this;return b=a(b),b.each(function(b,e){e=a(e);var f=e.data("_gridstack_node");void 0!==f&&null!==f&&(f.noMove=!c,f.noMove||d._isOneColumnMode()&&!d.opts.disableOneColumnMode?(d.dd.draggable(e,"disable"),e.removeClass("ui-draggable-handle")):(d.dd.draggable(e,"enable"),e.addClass("ui-draggable-handle")))}),this},j.prototype.enableMove=function(a,b){this.movable(this.container.children("."+this.opts.itemClass),a),b&&(this.opts.disableDrag=!a)},j.prototype.enableResize=function(a,b){this.resizable(this.container.children("."+this.opts.itemClass),a),b&&(this.opts.disableResize=!a)},j.prototype.disable=function(){this.movable(this.container.children("."+this.opts.itemClass),!1),this.resizable(this.container.children("."+this.opts.itemClass),!1),this.container.trigger("disable")},j.prototype.enable=function(){this.movable(this.container.children("."+this.opts.itemClass),!0),this.resizable(this.container.children("."+this.opts.itemClass),!0),this.container.trigger("enable")},j.prototype.locked=function(b,c){return b=a(b),b.each(function(b,d){d=a(d);var e=d.data("_gridstack_node");void 0!==e&&null!==e&&(e.locked=c||!1,d.attr("data-gs-locked",e.locked?"yes":null))}),this},j.prototype.maxHeight=function(b,c){return b=a(b),b.each(function(b,d){d=a(d);var e=d.data("_gridstack_node");void 0!==e&&null!==e&&(isNaN(c)||(e.maxHeight=c||!1,d.attr("data-gs-max-height",c)))}),this},j.prototype.minHeight=function(b,c){return b=a(b),b.each(function(b,d){d=a(d);var e=d.data("_gridstack_node");void 0!==e&&null!==e&&(isNaN(c)||(e.minHeight=c||!1,d.attr("data-gs-min-height",c)))}),this},j.prototype.maxWidth=function(b,c){return b=a(b),b.each(function(b,d){d=a(d);var e=d.data("_gridstack_node");void 0!==e&&null!==e&&(isNaN(c)||(e.maxWidth=c||!1,d.attr("data-gs-max-width",c)))}),this},j.prototype.minWidth=function(b,c){return b=a(b),b.each(function(b,d){d=a(d);var e=d.data("_gridstack_node");void 0!==e&&null!==e&&(isNaN(c)||(e.minWidth=c||!1,d.attr("data-gs-min-width",c)))}),this},j.prototype._updateElement=function(b,c){b=a(b).first();var d=b.data("_gridstack_node");if(void 0!==d&&null!==d){var e=this;e.grid.cleanNodes(),e.grid.beginUpdate(d),c.call(this,b,d),e._updateContainerHeight(),e._triggerChangeEvent(),e.grid.endUpdate()}},j.prototype.resize=function(a,b,c){this._updateElement(a,function(a,d){b=null!==b&&void 0!==b?b:d.width,c=null!==c&&void 0!==c?c:d.height,this.grid.moveNode(d,d.x,d.y,b,c)})},j.prototype.move=function(a,b,c){this._updateElement(a,function(a,d){b=null!==b&&void 0!==b?b:d.x,c=null!==c&&void 0!==c?c:d.y,this.grid.moveNode(d,b,c,d.width,d.height)})},j.prototype.update=function(a,b,c,d,e){this._updateElement(a,function(a,f){b=null!==b&&void 0!==b?b:f.x,c=null!==c&&void 0!==c?c:f.y,d=null!==d&&void 0!==d?d:f.width,e=null!==e&&void 0!==e?e:f.height,this.grid.moveNode(f,b,c,d,e)})},j.prototype.verticalMargin=function(a,b){if(void 0===a)return this.opts.verticalMargin;var c=g.parseHeight(a);this.opts.verticalMarginUnit===c.unit&&this.opts.height===c.height||(this.opts.verticalMarginUnit=c.unit,this.opts.verticalMargin=c.height,b||this._updateStyles())},j.prototype.cellHeight=function(a,b){if(void 0===a){if(this.opts.cellHeight)return this.opts.cellHeight;var c=this.container.children("."+this.opts.itemClass).first();return Math.ceil(c.outerHeight()/c.attr("data-gs-height"))}var d=g.parseHeight(a);this.opts.cellHeightUnit===d.heightUnit&&this.opts.height===d.height||(this.opts.cellHeightUnit=d.unit,this.opts.cellHeight=d.height,b||this._updateStyles())},j.prototype.cellWidth=function(){return Math.round(this.container.outerWidth()/this.opts.width)},j.prototype.getCellFromPixel=function(a,b){var c=void 0!==b&&b?this.container.offset():this.container.position(),d=a.left-c.left,e=a.top-c.top,f=Math.floor(this.container.width()/this.opts.width),g=Math.floor(this.container.height()/parseInt(this.container.attr("data-gs-current-height")));return{x:Math.floor(d/f),y:Math.floor(e/g)}},j.prototype.batchUpdate=function(){this.grid.batchUpdate()},j.prototype.commit=function(){this.grid.commit(),this._updateContainerHeight()},j.prototype.isAreaEmpty=function(a,b,c,d){return this.grid.isAreaEmpty(a,b,c,d)},j.prototype.setStatic=function(a){this.opts.staticGrid=!0===a,this.enableMove(!a),this.enableResize(!a),this._setStaticClass()},j.prototype._setStaticClass=function(){!0===this.opts.staticGrid?this.container.addClass("grid-stack-static"):this.container.removeClass("grid-stack-static")},j.prototype._updateNodeWidths=function(a,b){this.grid._sortNodes(),this.grid.batchUpdate();for(var c={},d=0;d<this.grid.nodes.length;d++)c=this.grid.nodes[d],this.update(c.el,Math.round(c.x*b/a),void 0,Math.round(c.width*b/a),void 0);this.grid.commit()},j.prototype.setGridWidth=function(a,b){this.container.removeClass("grid-stack-"+this.opts.width),!0!==b&&this._updateNodeWidths(this.opts.width,a),this.opts.width=a,this.grid.width=a,this.container.addClass("grid-stack-"+a)},i.prototype.batch_update=e(i.prototype.batchUpdate),i.prototype._fix_collisions=e(i.prototype._fixCollisions,"_fix_collisions","_fixCollisions"),i.prototype.is_area_empty=e(i.prototype.isAreaEmpty,"is_area_empty","isAreaEmpty"),i.prototype._sort_nodes=e(i.prototype._sortNodes,"_sort_nodes","_sortNodes"),i.prototype._pack_nodes=e(i.prototype._packNodes,"_pack_nodes","_packNodes"),i.prototype._prepare_node=e(i.prototype._prepareNode,"_prepare_node","_prepareNode"),i.prototype.clean_nodes=e(i.prototype.cleanNodes,"clean_nodes","cleanNodes"),i.prototype.get_dirty_nodes=e(i.prototype.getDirtyNodes,"get_dirty_nodes","getDirtyNodes"),i.prototype.add_node=e(i.prototype.addNode,"add_node","addNode, "),i.prototype.remove_node=e(i.prototype.removeNode,"remove_node","removeNode"),i.prototype.can_move_node=e(i.prototype.canMoveNode,"can_move_node","canMoveNode"),i.prototype.move_node=e(i.prototype.moveNode,"move_node","moveNode"),i.prototype.get_grid_height=e(i.prototype.getGridHeight,"get_grid_height","getGridHeight"),i.prototype.begin_update=e(i.prototype.beginUpdate,"begin_update","beginUpdate"),i.prototype.end_update=e(i.prototype.endUpdate,"end_update","endUpdate"),i.prototype.can_be_placed_with_respect_to_height=e(i.prototype.canBePlacedWithRespectToHeight,"can_be_placed_with_respect_to_height","canBePlacedWithRespectToHeight"),j.prototype._trigger_change_event=e(j.prototype._triggerChangeEvent,"_trigger_change_event","_triggerChangeEvent"),j.prototype._init_styles=e(j.prototype._initStyles,"_init_styles","_initStyles"),j.prototype._update_styles=e(j.prototype._updateStyles,"_update_styles","_updateStyles"),j.prototype._update_container_height=e(j.prototype._updateContainerHeight,"_update_container_height","_updateContainerHeight"),j.prototype._is_one_column_mode=e(j.prototype._isOneColumnMode,"_is_one_column_mode","_isOneColumnMode"),j.prototype._prepare_element=e(j.prototype._prepareElement,"_prepare_element","_prepareElement"),j.prototype.set_animation=e(j.prototype.setAnimation,"set_animation","setAnimation"),j.prototype.add_widget=e(j.prototype.addWidget,"add_widget","addWidget"),j.prototype.make_widget=e(j.prototype.makeWidget,"make_widget","makeWidget"),j.prototype.will_it_fit=e(j.prototype.willItFit,"will_it_fit","willItFit"),
j.prototype.remove_widget=e(j.prototype.removeWidget,"remove_widget","removeWidget"),j.prototype.remove_all=e(j.prototype.removeAll,"remove_all","removeAll"),j.prototype.min_height=e(j.prototype.minHeight,"min_height","minHeight"),j.prototype.min_width=e(j.prototype.minWidth,"min_width","minWidth"),j.prototype._update_element=e(j.prototype._updateElement,"_update_element","_updateElement"),j.prototype.cell_height=e(j.prototype.cellHeight,"cell_height","cellHeight"),j.prototype.cell_width=e(j.prototype.cellWidth,"cell_width","cellWidth"),j.prototype.get_cell_from_pixel=e(j.prototype.getCellFromPixel,"get_cell_from_pixel","getCellFromPixel"),j.prototype.batch_update=e(j.prototype.batchUpdate,"batch_update","batchUpdate"),j.prototype.is_area_empty=e(j.prototype.isAreaEmpty,"is_area_empty","isAreaEmpty"),j.prototype.set_static=e(j.prototype.setStatic,"set_static","setStatic"),j.prototype._set_static_class=e(j.prototype._setStaticClass,"_set_static_class","_setStaticClass"),d.GridStackUI=j,d.GridStackUI.Utils=g,d.GridStackUI.Engine=i,d.GridStackUI.GridStackDragDropPlugin=c,a.fn.gridstack=function(b){return this.each(function(){var c=a(this);c.data("gridstack")||c.data("gridstack",new j(this,b))})},d.GridStackUI}),/**
 * gridstack.js 0.3.0
 * http://troolee.github.io/gridstack.js/
 * (c) 2014-2016 Pavel Reznikov, Dylan Weiss
 * gridstack.js may be freely distributed under the MIT license.
 * @preserve
*/
function(a){if("function"==typeof define&&define.amd)define(["jquery","lodash","static/assets/global/plugins/gridstack/dist/gridstack","jquery-ui/data","jquery-ui/disable-selection","jquery-ui/focusable","jquery-ui/form","jquery-ui/ie","jquery-ui/keycode","jquery-ui/labels","jquery-ui/jquery-1-7","jquery-ui/plugin","jquery-ui/safe-active-element","jquery-ui/safe-blur","jquery-ui/scroll-parent","jquery-ui/tabbable","jquery-ui/unique-id","jquery-ui/version","jquery-ui/widget","jquery-ui/widgets/mouse","jquery-ui/widgets/draggable","jquery-ui/widgets/droppable","jquery-ui/widgets/resizable"],a);else if("undefined"!=typeof exports){try{jQuery=require("jquery")}catch(a){}try{_=require("lodash")}catch(a){}try{GridStackUI=require("static/assets/global/plugins/gridstack/dist/gridstack")}catch(a){}a(jQuery,_,GridStackUI)}else a(jQuery,_,GridStackUI)}(function(a, b, c){function d(a){c.GridStackDragDropPlugin.call(this,a)}window;return c.GridStackDragDropPlugin.registerPlugin(d),d.prototype=Object.create(c.GridStackDragDropPlugin.prototype),d.prototype.constructor=d,d.prototype.resizable=function(c, d){if(c=a(c),"disable"===d||"enable"===d)c.resizable(d);else if("option"===d){var e=arguments[2],f=arguments[3];c.resizable(d,e,f)}else c.resizable(b.extend({},this.grid.opts.resizable,{start:d.start||function(){},stop:d.stop||function(){},resize:d.resize||function(){}}));return this},d.prototype.draggable=function(c, d){return c=a(c),"disable"===d||"enable"===d?c.draggable(d):c.draggable(b.extend({},this.grid.opts.draggable,{containment:this.grid.opts.isNested?this.grid.container.parent():null,start:d.start||function(){},stop:d.stop||function(){},drag:d.drag||function(){}})),this},d.prototype.droppable=function(b, c){return b=a(b),"disable"===c||"enable"===c?b.droppable(c):b.droppable({accept:c.accept}),this},d.prototype.isDroppable=function(b, c){return b=a(b),Boolean(b.data("droppable"))},d.prototype.on=function(b, c, d){return a(b).on(c,d),this},d});
//# sourceMappingURL=gridstack.min.map