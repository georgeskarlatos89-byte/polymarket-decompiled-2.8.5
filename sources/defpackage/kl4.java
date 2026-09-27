package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.zip.Inflater;
import okhttp3.Call;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kl4 implements Closeable {
    public final /* synthetic */ int a;
    public final Object b;

    public kl4() {
        this.a = 4;
        this.b = new Inflater(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((j36) obj).close();
                return;
            case 1:
                for (InputStream inputStream : (InputStream[]) obj) {
                    r1k.a(inputStream);
                }
                return;
            case 2:
                ((Call) obj).cancel();
                return;
            case 3:
                ((su6) obj).close();
                return;
            default:
                ((Inflater) obj).end();
                return;
        }
    }

    public String e() {
        InputStreamReader inputStreamReader = new InputStreamReader(((InputStream[]) this.b)[1], r1k.b);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[Barcode.FORMAT_UPC_E];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    String stringWriter2 = stringWriter.toString();
                    inputStreamReader.close();
                    return stringWriter2;
                }
            }
        } catch (Throwable th) {
            inputStreamReader.close();
            throw th;
        }
    }

    public /* synthetic */ kl4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
