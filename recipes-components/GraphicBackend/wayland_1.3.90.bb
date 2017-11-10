SUMMARY = "Wayland, a protocol between a compositor and clients"
DESCRIPTION = "Maintenend version of Wayland forked from OSS by BOSCH/ADIT "
HOMEPAGE = "http://wayland.freedesktop.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=1d4476a7d98dd5691c53d4d43a510c72"

FILES_${PN} = " \
	${bindir} \
	${libdir} \
	/usr/share \
"
FILES_${PN}-dev = " \
	${includedir} \
"

SRC_URI = "file://wayland-custom.tar.gz"

S = "${WORKDIR}/Sources"

inherit autotools pkgconfig

PR = "r0"


# Skip sanity check because the files do not contain GNU_HASH
# else "ERROR: QA Issue with vivante-directfb-lib: No GNU_HASH in the elf binary"
INSANE_SKIP_${PN} += "ldflags dev-deps dev-so"

# We need wayland-native for the wayland-scanner utility
BBCLASSEXTEND = "native"

DEPENDS_virtclass-native = "expat-native libffi-native"
DEPENDS = "expat libffi wayland-native"

EXTRA_OECONF_virtclass-native = "--disable-documentation --enable-scanner"
EXTRA_OECONF = "--disable-documentation --disable-scanner"
EXTRA_OEMAKE += '"LIBTOOL=${STAGING_BINDIR_CROSS}/${HOST_SYS}-libtool"'

