# KernelSU - File Manager Mod

This is a modified and heavily obfuscated version of the official [KernelSU](https://github.com/tiann/KernelSU) Manager application. 

The primary goal of this fork is to bypass strict root detection mechanisms used by various applications. Some apps scan the device for the official KernelSU package name or native libraries and refuse to run if they are found. This project resolves that issue by completely renaming the manager and its internal components.

## Features
- **Camouflaged Package Name**: Changed from `me.weishu.kernelsu` to `com.kiran.manage`.
- **Camouflaged App Name**: Installed as **File Manager**, seamlessly blending in with typical system apps.
- **Hidden Native Libraries**: Internal JNI libraries (`libkernelsu.so`) have been renamed to `libfilemgr.so` so that apps scanning for native libraries cannot detect them.
- **Obfuscated Codebase**: Fully compiled in Release mode with R8 Minification (Proguard) to shrink and obfuscate the internal application code.

## Download
You can download the latest obfuscated APK from the [Releases page](../../releases). 

Simply install the APK on your KernelSU-supported device. 

## Credits
All credit for the core functionality, kernel modules, and the original manager goes to the incredible developers of the official [KernelSU](https://github.com/tiann/KernelSU) project.

*Modded by Kiran*
