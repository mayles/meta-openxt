DESCRIPTION = "Input daemon for OpenXT"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=321bf41f280cf805086dd5a720b37785"
DEPENDS = "openxt-idl dbus xen-tools libxcdbus udev openxt-rpcgen-native openssl libevent libxcxenstore libdmbus libxenbackend xenfb2"

RDEPENDS_${PN} += "openxt-keyboard-list libxcxenstore"

PV = "0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://${OPENXT_GIT_MIRROR}/input.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH} \
	   file://input-daemon.initscript \
"

EXTRA_OECONF += "--with-idldir=${STAGING_IDLDIR}"

CFLAGS_append += " -Wno-unused-parameter -Wno-deprecated-declarations "

S = "${WORKDIR}/git"

ASNEEDED = ""

LDFLAGS += "-lm -lcrypto"

inherit autotools openxt update-rc.d pkgconfig


INITSCRIPT_NAME = "openxt-input"
INITSCRIPT_PARAMS = "defaults 75"

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/input-daemon.initscript ${D}${sysconfdir}/init.d/xenclient-input
}
