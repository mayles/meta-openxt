DESCRIPTION = "All packages required for OpenXT installer"
LICENSE = "GPLv2 & MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6      \
                    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r11"

inherit packagegroup

RDEPENDS_${PN} = " \
    kernel-modules \
    openssh \
    openssh-sshd-tcp-init \
    util-linux-mount \
    util-linux-umount \
    blktap \
    dialog \
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    eject \
    lvm2 \
    util-linux-sfdisk \
    xen \
    xen-tools \
    openxt-installer \
    openxt-installer-tweaks \
    cryptsetup \
    openxt-get-config-key \
    falloc \
    openssl \
    openxt-toolstack \
    read-edid \
    pciutils-ids \
    dosfstools \
    syslinux \
    syslinux-isohybrid \
    syslinux-isolinux \
    syslinux-mboot \
    syslinux-pxelinux \
    ethtool \
    rsyslog \
    openxt-udev-force-discreet-net-to-eth0 \
    bc \
    wget \
    refpolicy-mcs \
    dmidecode \
    netcat \
    tboot \
    acms \
    trousers \
    trousers-data \
    tpm-tools \
    openxt-pcrdiff \
    openxt-tpm-scripts \
    ncurses \
"

# open-iscsi-user \
# 
