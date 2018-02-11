# AndroidMvpSample
This project is used demonstrate how to user MVP architecture in Android development。

I made two implementations version,the enhance version used to solve potential memory leak problem.
when your app make a request to remote server,it need a period of time to back ,but if you cancel the Activity or Fragment where make the request in the period,the Activity or Fragment instance referenced by the presenter can not released, memory leak happend. In the enhance version I let the Presenter hold a WeakReference of View (Activity or Fragment) to prevent  memory leak。

If you not allow user cancle a operation before it finished(eg: call a remote server and wait until the result back)
the normal version is qualified,but I recommend you use the enhance version.

[中文教程地址](http://blog.csdn.net/shusheng0007/article/details/77726636 "中文教程地址")