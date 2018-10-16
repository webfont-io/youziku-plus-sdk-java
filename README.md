# 一、介绍

## 1．SDK适用语言<br/>
SDK适用于在Java中调用<a  target="_blank"  href="http://service.youziku.com">service.youziku.com</a>中的反爬虫api<br/>

## 2.工作流程<br/>　　
   ①用户用后端程序调用SDK，提交动态内容到有字库的反爬虫服务器<br/>
   ②服务器接收到所提交内容后，根据内容生成反爬虫策略文件<br/>
   ③服务器将所有文件上传至阿里云CDN，并返回@font-face语句和混淆后的内容<br/>
   ④内容显示时，只需要显示混淆后的内容即可，@font-face语句会让内容还原成可阅读状态<br/>

## 3.@font-face语句<br/>
SDK的返回值主要内容是@font-face语句，@font-face语句是CSS3中的一个功能模块，是所有浏览器天然支持的CSS语句。它的作用是将一个远程字体文件加载到当前页面，并且定义成一个字体，前端页面能够像使用本地字体一样使用该字体。@font-face语句是实现反爬虫的核心代码。<br/>

## 4. 显示字体效果
用户将返回的@font-face与返回的混淆内容一起存放数据库，当需要显示内容时，将混淆内容内容输出到前端，同时，将@font-face语句以<style>标签形式插入到前端代码中，混淆内容通过@font-face的字体即可还原出原始内容。

# 二、环境
1)jar包方式引用<br/><br/>
1.jdk1.6.0_31及以上 <br />
2.依赖：<br />
　　　commons-httpclient-3.0.1<br />
　　　commons-logging-1.0.3<br />
　　　commons-codec-1.2<br />
　　　fastjson-1.2.5<br />
   
3.<a href="https://github.com/youziku/youziku-sdk-java/raw/master/sdk%E4%B8%8B%E8%BD%BD/youziku-service-plus.sdk-1.0.0.zip">sdk下载</a><br />
