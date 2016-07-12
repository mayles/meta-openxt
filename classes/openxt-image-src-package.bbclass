# Conditionally inherits the package openxt-image-src-package-real.
#
# Set XENCLIENT_BUILD_SRC_PACKAGES to 1 to enable.

inherit ${@"openxt-image-src-package-real"if(d.getVar("XENCLIENT_BUILD_SRC_PACKAGES",1)=="1")else("null")}

