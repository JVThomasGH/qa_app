echo off
call taskkill /F /IM "qemu-system-x86_64.exe" /T
call emulator -avd Nexus5X
