DESCRIPTION = "Rpi4 fan driver for Yocto" 
LICENSE = "GPL-2.0" 
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

inherit module 

SRC_URI = "file://myfan_driver.c \
           file://Makefile"

S = "${WORKDIR}" 

EXTRA_OEMAKE = "'KERNELDIR=${STAGING_KERNEL_DIR}'" 

do_compile() { 
    oe_runmake 
} 

do_install() { 
    install -d ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/
    install -m 0644 myfan_driver.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra 
} 

FILES${PN} += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/extra/myfan_driver.ko"