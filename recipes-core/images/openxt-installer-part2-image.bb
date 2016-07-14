# Part 2 of the OpenXT host installer.
#
# This contains the logic to install or upgrade a specific version of
# OpenXT. The resulting image is copied to the control.tar.bz2 file
# in the OpenXT repository.

COMPATIBLE_MACHINE = "(openxt-dom0)"

export IMAGE_BASENAME = "openxt-installer-part2-image"

PACKAGE_INSTALL = "openxt-installer-part2"

IMAGE_BOOT = ""
IMAGE_FSTYPES = "tar.bz2"
IMAGE_INSTALL = ""
IMAGE_LINGUAS = ""
ONLINE_PACKAGE_MANAGEMENT = "none"

inherit image
inherit openxt-image-src-info
inherit openxt-image-src-package
inherit openxt-licences
require openxt-version.inc

post_rootfs_shell_commands() {
	mv ${IMAGE_ROOTFS}/etc/issue ${IMAGE_ROOTFS}/config/;
	rm -rf ${IMAGE_ROOTFS}/dev;
	rm -rf ${IMAGE_ROOTFS}/etc;
	rm -rf ${IMAGE_ROOTFS}/usr;
	# safe to now remove the run directory and put the script there
	rm -rf ${IMAGE_ROOTFS}/run;
	mv -f ${IMAGE_ROOTFS}/run.installer ${IMAGE_ROOTFS}/run;
}

ROOTFS_POSTPROCESS_COMMAND += " post_rootfs_shell_commands; "

LICENSE = "GPLv2 & MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6      \
                    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# prevent ldconfig from being run
LDCONFIGDEPEND = ""
