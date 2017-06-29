FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

do_install_append() {
    install -d ${D}${includedir}
    cp -r ${D}${libdir}/libffi-${PV}/include/* ${D}${includedir}/ || true
}
