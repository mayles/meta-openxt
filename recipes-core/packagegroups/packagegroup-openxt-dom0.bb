DESCRIPTION = "All packages required for OpenXT dom0"
LICENSE = "GPLv2 & MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6      \
                    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit openxt
inherit packagegroup

RDEPENDS_${PN} = " \
    openssh \
    openssh-sshd-tcp-init \
    util-linux-mount \
    util-linux-umount \
    xen \
    xen-tools \
    xen-firmware \
    xen-xsm-policy \
    grub \
    tboot \
    e2fsprogs-tune2fs \
    e2fsprogs-resize2fs \
    kernel-modules \
    libv4v \
    libv4v-bin \
    libedid \
    lvm2 \
    bridge-utils \
    iptables \
    iproute2 \
    qemu-dm \
    xcpmd \
    vbetool-xc \
    openxt-toolstack \
    openxt-toolstack-xenstored \
    openxt-input-daemon \
    openxt-dom0-tweaks \
    openxt-splash-images \
    openxt-config-access \
    openxt-cryptdisks \
    cryptsetup \
    openxt-get-config-key \
    openxt-root-ro \
    alsa-utils-alsactl \
    alsa-utils-scripts \
    alsa-utils-alsamixer \
    openxt-boot-sound \
    curl \
    trousers \
    trousers-data \
    tpm-tools \
    tpm-tools-sa \
    openxt-tpm-setup \
    pciutils-ids \
    acms \
    read-edid \
    openssl \
    ntpdate \
    dd-buffered \
    vhd-copy \
    secure-vm \
    openxt-sec-scripts \
    pmtools \
    blktap \
    svirt-interpose \
    selinux-load \
    ustr \
    ethtool \
    bootage \
    microcode-ctl \
    intel-microcode \
    rsyslog \
    logrotate \
    qemu-wrappers \
    dialog \
    openxt-udev-force-discreet-net-to-eth0 \
    openxt-nwd \
    wget \
    xen-tools-xenconsoled \
    openxt-repo-certs \
    gobi-loader \
    usb-modeswitch \
    upgrade-db \
    rpc-proxy \
    dbd \
    openxt-language-sync \
    atapi-pt-helper \
    audio-helper \
    compleat \
    xec \
    apptool \
    dmidecode \
    netcat \
    libicbinn-server \
    screen \
    openxt-pcrdiff \
    drm-surfman-plugin \
    eject \
    linux-input \
    iputils-ping \
    vusb-daemon \
    xenmgr-data \
    updatemgr \
    uid \
    surfman \
    linuxfb-surfman-plugin \
    dm-agent \
    xenmgr \
"

# OE upgrade - temporarly disabled:

# gconf-dbus \
# xserver-xorg \
# xf86-video-intel-openxt-dom0 \
# xf86-video-vesa-openxt-dom0 \
#
