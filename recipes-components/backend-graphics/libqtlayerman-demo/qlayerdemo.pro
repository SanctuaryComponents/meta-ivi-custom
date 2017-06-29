TEMPLATE     = app
TARGET       = qlayerdemo

#QT          += declarative opengl
QT          += widgets

INCLUDEPATH += $$[QT_SYSROOT]/usr/include/ilm \
							 $$[QT_SYSROOT]/usr/include/layermanager \


#LIBS        += -lqtlayerman -lilmClient -lilmControl

SOURCES     = main.cpp
OTHER_FILES = planes.qml

qml.files += planes.qml 

isEmpty(INSTALLPREFIX) {
    target.path = $$[QT_INSTALL_EXAMPLES]
    qml.path = $$[QT_INSTALL_EXAMPLES]
} else {
    target.path = $$INSTALLPREFIX/share/
    qml.path = $$INSTALLPREFIX/share/
}

INSTALLS += target
INSTALLS += qml


