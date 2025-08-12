# yocto-rpi4b


## Create yocto image

### Build Host Packages
```
sudo apt-get install build-essential chrpath cpio debianutils diffstat file gawk gcc git iputils-ping libacl1 lz4 locales python3 python3-git python3-jinja2 python3-pexpect python3-pip python3-subunit socat texinfo unzip wget xz-utils zstd
```

pip install kas

for conda python websockets warning
pip install websockets websocket-client

kas build kas-project.yml


### Quick rebuild
kas shell kas.yml
bitbake core-image-minimal


disable apparmor restriction on unprivileged user namespaces for this session only
echo 0 | sudo tee /proc/sys/kernel/apparmor_restrict_unprivileged_userns


### Flash SD

lsblk

cd /home/trizotto/Desktop/yocto-rpi4b/raspberrypi-machine/sources/tmp/deploy/images/raspberrypi4-64
sudo bmaptool copy core-image-base-raspberrypi4-64.wic.bz2 /dev/sd<>


### Meta-fan

Create layer
bitbake-layers create-layer ../XXXX

test layer (build)
bitbake myfan-driver

get variables value : bitbake -e myfan-driver | grep ^PN=

### Kernel module
sudo insmod ./hello-1.ko
sudo rmmod hello-1

sudo dmesg | grep "Hello"

### Resources  
https://docs.yoctoproject.org/brief-yoctoprojectqs/index.html

https://kas.readthedocs.io/en/latest/userguide/project-configuration.html
https://kas.readthedocs.io/en/latest/format-changelog.html#version-19

https://git.yoctoproject.org/meta-raspberrypi/about/

Kernel module
https://tldp.org/LDP/lkmpg/2.6/html/lkmpg.html


Create layer
https://docs.yoctoproject.org/dev-manual/layers.html
https://docs.yoctoproject.org/kernel-dev/intro.html