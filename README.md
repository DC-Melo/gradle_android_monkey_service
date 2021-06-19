# DC Standard Readme

![](https://img.shields.io/badge/platform-Android-brightgreen.svg) ![](https://img.shields.io/badge/language-java-yellow.svg) ![](https://img.shields.io/badge/license-Apache--2.0-blue.svg)


## Table of Contents

- [Background](#background)
- [Install](#install)
- [Usage](#usage)
	- [Generator](#generator)
- [Badge](#badge)
- [Example Readmes](#example-readmes)
- [Related Efforts](#related-efforts)
- [Maintainers](#maintainers)
- [Contributing](#contributing)
- [License](#license)

## Background

## Install

1. Enviroment
```sh
$ uname -a
Linux wtdcserver 5.4.0-73-generic #82~18.04.1-Ubuntu SMP Fri Apr 16 15:10:02 UTC 2021 x86_64 x86_64 x86_64 GNU/Linux

$ java -version

java version "13.0.1" 2019-10-15
Java(TM) SE Runtime Environment (build 13.0.1+9)
Java HotSpot(TM) 64-Bit Server VM (build 13.0.1+9, mixed mode, sharing)

$ gradle -version
------------------------------------------------------------
Gradle 7.0.2
------------------------------------------------------------

Build time:   2021-05-14 12:02:31 UTC
Revision:     1ef1b260d39daacbf9357f9d8594a8a743e2152e

Kotlin:       1.4.31
Groovy:       3.0.7
Ant:          Apache Ant(TM) version 1.10.9 compiled on September 27 2020
JVM:          13.0.1 (Oracle Corporation 13.0.1+9)
OS:           Linux 5.4.0-73-generic amd64
```

![Enviroment](readme_files/enviroment.png) 

2. Clone code and change directories

```sh
$ git clone https://gitee.com/dc-melo/gradle_android_monkey_service.git
OR
$ git clone https://github.com/DC-Melo/gradle_android_monkey_service.git
$ cd gradle_android_monkey_service
```

Usage of Android Monkey Adapter runner
``` sh
usage: java -jar jarfile [-options/ --options]...
            
 -d,--device-id <arg>         the id list of the devices which is need to
                              run monkey test
 -h,--help                    Output help information!
 -n,--pkg-name <arg>          package name of this appliacation
 -p,--pkg-path <arg>          point to an Android application path in the
                              storage
 -r,--user-name <arg>         user name of this job owner
 -s,--single-duration <arg>   expected one monkey job duration (hour)
 -t,--series-duration <arg>   expected total monkey jobs duration (hour)
 -u,--unlock-cmd-path <arg>   point to an unlock script path which must be
                              standalone executable
 -v,--pkg-version <arg>       version of this application

```
Usage of Android Monkey Adapter analyzer
``` sh
usage: java -jar jarfile [-options/ --options]...

options are as below:
 -b,--bugreport-log-file-name <arg>   File name of bugreport log.
 -d,--duration <arg>                  Expected uration of single monkey
                                      job(8 hours or 4.5 hours).
 -h,--help                            Output help information!
 -l,--logcat-log-file-name <arg>      File name of logcat log.
 -m,--monkey-log-file-name <arg>      File name of monkey log.
 -n,--package-name <arg>              Package name of an Android
                                      Application.
 -p,--properties-file-name <arg>      File name of each monkey running
                                      summary.
 -t,--traces-log-file-name <arg>      File name of traces log.
 -w,--workspaces <w>                  Workspace of monkey running
                                      directoy.
```


## Usage

Example
``` sh
java -jar monkey-adapter-runner.jar --device-id 45071c540c04197 --user-name xxxxxx --pkg-path ./example.apk --pkg-name com.example --pkg-version 3.0 --single-duration 8 --series-duration 8
java -jar monkey-adapter-analyzer.jar --workspaces ./logs/ --monkey-log-file-name monkey_log.txt --logcat-log-file-name logcat_log.txt --traces-log-file-name traces_log.txt --bugreport-log-file-name bugreport_log.txt --properties-file-name properties.txt --duration 8 --package-name com.example
```

### Generator


## Badge

## Example Readmes


## Related Efforts


## Maintainers

[@DC-Melo](https://github.com/DC-Melo)
[@DC-Melo](https://gitee.com/DC-Melo)

## Contributing

Feel free to dive in! [Open an issue](https://github.com/DC-Melo/gradle_android_monkey_service/issues/new) or submit PRs.

Standard Readme follows the [Contributor Covenant](http://contributor-covenant.org/version/1/3/0/) Code of Conduct.

### Contributors

This project exists thanks to all the people who contribute. 
<a href="https://github.com/RichardLitt/gradle_android_monkey_service/graphs/contributors"><img src="https://opencollective.com/gradle_android_monkey_service/contributors.svg?width=890&button=false" /></a>


## License

[MIT](LICENSE) © DC-Melo王江

## Donation

If this project help you reduce time to develop, you can give me a cup of coffee :)

如果你喜欢我的项目，请在对应的项目右上角 "Star" 一下。你的支持是我最大的鼓励！ ^^ 你也还可以扫描下面的二维码，对作者进行打赏。

If you like my project, "Star" in the corresponding project right corner, please. Your support is my biggest encouragement! ^^ You can also scan the qr code below or Donate to this project using Paypal, donation to Author.
---
<div align="center">
<img src="readme_files/dc_wechat_pay.png" width="200" >
<img src="readme_files/dc_ali_pay.png"    width="200" >
<img src="readme_files/dc_bitcoin.png"    width="200" >
</div>

如果在捐赠留言中备注名称，将会被记录到列表中~ 如果你也是github开源作者，捐赠时可以留下github项目地址或者个人主页地址，链接将会被添加到列表中起到互相推广的作用

If you comment on the name in the donation message, it will be recorded in the list. ~If you are also an open source author of github, you can leave the GitHub project address or personal home page address when donating. Links will be added to the list to promote each other.
捐赠列表(Donation list)
