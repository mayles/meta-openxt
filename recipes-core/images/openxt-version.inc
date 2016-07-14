# Writes the OpenXT build number, build date, version and release
# to /etc/issue and /etc/issue.net.

OPENXT_BUILD ?= "local"
OPENXT_BUILD_DATE ?= "unknown"
OPENXT_VERSION ?= "local"
OPENXT_RELEASE ?= "unknown"
OPENXT_TOOLS ?= "unknown"

post_rootfs_version_commands() {
	# Add /etc/issue
	{
		echo 'product = OpenXT';
		echo 'build = ${OPENXT_BUILD}';
		echo 'build_date = ${OPENXT_BUILD_DATE}';
		echo 'build_branch = ${OPENXT_BUILD_BRANCH}';
		echo 'version = ${OPENXT_VERSION}';
		echo 'release = ${OPENXT_RELEASE}';
		echo 'tools = ${OPENXT_TOOLS}';
		echo 'DefaultNICs = 0';
	} > ${IMAGE_ROOTFS}/etc/issue;

	cp ${IMAGE_ROOTFS}/etc/issue ${IMAGE_ROOTFS}/etc/issue.net;
}

ROOTFS_POSTPROCESS_COMMAND += " post_rootfs_version_commands; "
