package ex08.pub;

import ex08.sub.SubListener;

public interface PubListener {
    void add(SubListener subListener);

    void remove(SubListener subListener);

    void notifyChange(String msg);
}
