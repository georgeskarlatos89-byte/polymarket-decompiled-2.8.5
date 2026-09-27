package com.socure.docv.capturesdk.core.provider;

import android.app.Application;
import android.content.res.AssetFileDescriptor;
import com.socure.docv.capturesdk.common.config.model.Model;
import com.socure.docv.capturesdk.core.provider.interfaces.d;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import org.tensorflow.lite.Interpreter;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a implements d {
    public final Application a;
    public final String b;
    public final d c;
    public final int d;

    public a(Application application, String str, d dVar, int i) {
        application.getClass();
        dVar.getClass();
        this.a = application;
        this.b = str;
        this.c = dVar;
        this.d = i;
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.d
    public final Object get() {
        AssetFileDescriptor openFd = this.a.getAssets().openFd(this.b);
        try {
            FileInputStream fileInputStream = new FileInputStream(openFd.getFileDescriptor());
            try {
                MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                map.getClass();
                fileInputStream.close();
                openFd.close();
                Interpreter.Options options = new Interpreter.Options();
                options.setNumThreads(4);
                return new Model(new Interpreter(map, options), ((Number) this.c.get()).floatValue(), this.d);
            } finally {
            }
        } finally {
        }
    }
}
