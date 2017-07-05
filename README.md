# AndroidMvpSample
This project is useed demonstrate how to user MVP architecture in Android development。

I made two implementations version,the enhance version used to solve potential memory leak problem.
when your app make a request to remote server,it need a period of time to back ,but if you cancel the Activity or Fragment where make the request in the reriod,the Activity or Fragment instance referenced by presenter can not release, memory leak happend. In the enhance version i let the  Presenter hold a weakReference of View (Activity or Fragment) to prevent  memory leak。

If you not allow user cancle a operation before it finished(eg: call a remote server and wait until the result back)
the first version is qualified,but i recommend you use the enhance version.
