DESCRIPTION = "Yocto module example for test"
LICENSE = "CLOSED"

SRC_URI ?= "https://dj-zhou@github.com/dj-zhou/yocto-module-test.git;protocol=https;lfs=0"
SRCREV_yocto-module-test = "${AUTOREV}"

DEPENDS = "libev libgpiod"

PV = "1.1.1"
S = "${WORKDIR}/git"

inherit meson

EXTRA_OEMESON_prepend = " -Db_sanitize=none"

FILES_${PN} = "/usr/bin/"
