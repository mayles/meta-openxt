DESCRIPTION = "OpenXT sync wui"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"
DEPENDS = "dojosdk-native"

OPENXT_BUILD ?= "unknown"
OPENXT_BUILD_DATE ?= "unknown"
OPENXT_BUILD_BRANCH ?= "unknown"
OPENXT_VERSION ?= "unknown"
OPENXT_RELEASE ?= "unknown"

PV = "0+git${SRCPV}"

SRCREV = "${AUTOREV}"
SRC_URI = "git://${OPENXT_GIT_MIRROR}/sync-wui.git;protocol=${OPENXT_GIT_PROTOCOL};branch=${OPENXT_BRANCH}"

S = "${WORKDIR}/git"

inherit openxt
inherit package_tar

do_configure() {
	:
}

do_compile() {
    make

    cat <<EOF > VERSION
build = ${OPENXT_BUILD}
build_date = ${OPENXT_BUILD_DATE}
build_branch = ${OPENXT_BUILD_BRANCH}
version = ${OPENXT_VERSION}
release = ${OPENXT_RELEASE}
EOF
}

do_install() {
    make DESTDIR=${D} install

    cp VERSION ${D}/sync-wui/
    cp VERSION ${D}/sync-wui-sources/
}

do_populate_sysroot() {
	:
}

do_package_write_ipk() {
	:
}

PACKAGES += "${PN}-sources"

FILES_${PN} = "/sync-wui"
FILES_${PN}-sources = "/sync-wui-sources"
