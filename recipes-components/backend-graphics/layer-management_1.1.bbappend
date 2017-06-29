FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


# Needed this for imx6 boards to use precompiled EGL libraries
python () {
    if ((d.getVar("MACHINE", True) or "").find("imx6") != -1):
	flags = d.getVar("OECMAKE_CXX_FLAGS", True)
	flags += " -DLINUX -DEGL_API_FB"
	d.setVar('OECMAKE_CXX_FLAGS', flags)
}



DEPENDS = "virtual/egl dbus libxkbcommon libffi"
EXTRA_OECMAKE += "-DWITH_WL_EXAMPLE=OFF -DWITH_X11_GLES=OFF -DWITH_EGL_EXAMPLE=OFF"
