FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
EXTRA_OECONF_append = " --enable-static "

FILES_${PN}-staticdev += " ${libdir}/lib* "
