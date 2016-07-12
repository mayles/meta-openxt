# Conditionally inherits the package openxt-src-package-real.
#
# Set XENCLIENT_BUILD_SRC_PACKAGES to 1 to enable.

inherit ${@"openxt-src-package-real"if(d.getVar("XENCLIENT_BUILD_SRC_PACKAGES",d,1)=="1")else("null")}
