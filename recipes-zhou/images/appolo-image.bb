
SUMMARY = "Image for Wandboard (WB-IMX6Q-BW)"

LICENSE = "MIT"

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL = " \
    boost \
    htop \
    libev \
    libgpiod-tools \
    meson \
    yaml-cpp \
"
# spdlog   # failed due to dnf problem
# libeigen # failed due to dnf problem

# sudo apt-get install fortune cowsay
# fortune | cowsay -f stegosaurus
print_logo () {
    echo >>${IMAGE_ROOTFS}/etc/issue '
 ___________________________________
/ Life is like a box of chocolates  \
\___________________________________/
\                             .       .
 \                           / `.   ." " 
  \                  .---.  <    > <    >  .---.
   \                 |    \  \ - ~ ~ - /  /    |
         _____          ..-~             ~-..-~
        |     |   \~~~\."                    `./~~~/
       ---------   \__/                        \__/
      ."  O    \     /               /       \  " 
     (_____,    `._."               |         }  \/~~~/
      `----.          /       }     |        /    \__/
            `-.      |       /      |       /      `. ,~~|
                ~-.__|      /_ - ~ ^|      /- _      `..-"   
                     |     /        |     /     ~-.     `-. _  _  _
                     |_____|        |_____|         ~ - . _ _ _ _ _>
'
}

ROOTFS_POSTPROCESS_COMMAND += "print_logo;"
# 2GiB
IMAGE_ROOTFS_SIZE = "2097152"
