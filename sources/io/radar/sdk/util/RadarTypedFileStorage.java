package io.radar.sdk.util;

import android.content.Context;
import io.getstream.chat.android.models.AttachmentType;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bJ\r\u0010\u0018\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cR\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lio/radar/sdk/util/RadarTypedFileStorage;", "T", "", "context", "Landroid/content/Context;", "fileName", "", "serializer", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "deserializer", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "cache", "Ljava/lang/Object;", "cacheLoaded", "", AttachmentType.FILE, "Ljava/io/File;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "clear", "", "modify", "transform", "read", "()Ljava/lang/Object;", "write", "value", "(Ljava/lang/Object;)V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarTypedFileStorage<T> {
    private T cache;
    private boolean cacheLoaded;
    private final Function1<JSONObject, T> deserializer;
    private final File file;
    private final ReentrantLock lock;
    private final Function1<T, JSONObject> serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public RadarTypedFileStorage(Context context, String str, Function1<? super T, ? extends JSONObject> function1, Function1<? super JSONObject, ? extends T> function12) {
        context.getClass();
        str.getClass();
        function1.getClass();
        function12.getClass();
        this.serializer = function1;
        this.deserializer = function12;
        this.lock = new ReentrantLock();
        File file = new File(context.getFilesDir(), "RadarSDK");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.file = new File(file, str);
    }

    public final void clear() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.cache = null;
            this.cacheLoaded = true;
            try {
                this.file.delete();
            } catch (Exception unused) {
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void modify(Function1<? super T, ? extends T> transform) {
        transform.getClass();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.cacheLoaded) {
                this.cacheLoaded = true;
                T t = null;
                try {
                    if (this.file.exists()) {
                        t = this.deserializer.invoke(new JSONObject(FilesKt.h(this.file)));
                    }
                } catch (Exception unused) {
                }
                this.cache = t;
            }
            T invoke = transform.invoke(this.cache);
            this.cache = invoke;
            File file = this.file;
            try {
                if (invoke != null) {
                    String jSONObject = this.serializer.invoke(invoke).toString();
                    jSONObject.getClass();
                    FilesKt.i(file, jSONObject);
                } else {
                    file.delete();
                }
            } catch (Exception unused2) {
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final T read() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.cacheLoaded) {
                return this.cache;
            }
            this.cacheLoaded = true;
            T t = null;
            try {
                if (this.file.exists()) {
                    t = this.deserializer.invoke(new JSONObject(FilesKt.h(this.file)));
                }
            } catch (Exception unused) {
            }
            this.cache = t;
            return t;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void write(T value) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.cache = value;
            this.cacheLoaded = true;
            try {
                File file = this.file;
                String jSONObject = this.serializer.invoke(value).toString();
                jSONObject.getClass();
                FilesKt.i(file, jSONObject);
            } catch (Exception unused) {
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
