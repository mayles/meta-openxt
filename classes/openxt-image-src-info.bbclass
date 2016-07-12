# Conditionally inherits openxt-image-src-info-real.
#
# Set XENCLIENT_COLLECT_SRC_INFO to 1 to enable.

inherit ${@"openxt-image-src-info-real"if(d.getVar("XENCLIENT_COLLECT_SRC_INFO",1)=="1")else("null")}
