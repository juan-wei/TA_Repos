package com.jw.consumer.view.bean;

public class RemoteCallBean {
    
    private String remoteTFURL;
    private String remoteSLTFURL;


    public void setRemoteTFURL(String remoteTFURL) {
        this.remoteTFURL = remoteTFURL;
    }

    public String getRemoteTFURL() {
//        remoteTFURL="http://127.0.0.1:7101/RemoteProducer/faces/adf.task-flow?adf.tfId=remote_url_tf&adf.tfDoc=/remote_url_tf.xml";
        remoteTFURL = "http://127.0.0.1:7101/RemoteProducer/faces/adf.task-flow?adf.tfDoc=%2FWEB-INF%2Fremote_url_tf.xml&adf.tfId=remote_url_tf";
        return remoteTFURL;
    }

    public void setRemoteSLTFURL(String remoteSLTFURL) {
        this.remoteSLTFURL = remoteSLTFURL;
    }

    public String getRemoteSLTFURL() {
        remoteSLTFURL = "http://127.0.0.1:7101/RemoteProducer/faces/adf.task-flow?adf.tfDoc=%2FWEB-INF%2Fshared_tf_jsf.xml&adf.tfId=shared_tf_jsf";
        return remoteSLTFURL;
    }
}
