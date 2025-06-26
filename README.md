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

### Resources  
https://docs.yoctoproject.org/brief-yoctoprojectqs/index.html

https://kas.readthedocs.io/en/latest/userguide/project-configuration.html
https://kas.readthedocs.io/en/latest/format-changelog.html#version-19