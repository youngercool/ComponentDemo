# ComponentDemo
Android 组件化方案简单Demo 

项目有 几个Module 分别是 主App Module 和Arouter Module,PicLoader Module ,Order Module ,每个Module 都会依赖 BasicLib 
在 gradle.properties 中定义一个字段 isModuleRun 来决定是组合运行还是 各个模块独立运行, 重点在 各个Module 中的 build.gradle中配置了些信息.
根据上面字段决定 
```
if (isModuleRun.toBoolean()) {
    apply plugin: 'com.android.application'
} else {
    apply plugin: 'com.android.library'
}
```


gradle 中配置 
```
sourceSets {
        main {
            if (isModuleRun.toBoolean()) {
                manifest.srcFile 'src/main/runalone/AndroidManifest.xml'
            } else {
                manifest.srcFile 'src/main/AndroidManifest.xml'
                java {
                    //release 时 debug 目录下文件不需要合并到主工程
                    exclude '**/runalone/**'
                }
            }
        }
    }
    
```
    来加载不同的 AndroidManifest 文件 ,不同的AndroidManifest 中配置不同的入口等等.
