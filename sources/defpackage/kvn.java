package defpackage;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class kvn {
    public static byte[] a(byte[] bArr) {
        Inflater inflater;
        InflaterInputStream inflaterInputStream;
        InflaterInputStream inflaterInputStream2 = null;
        try {
            inflater = new Inflater(true);
            try {
                inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[Barcode.FORMAT_UPC_E];
                while (true) {
                    int read = inflaterInputStream.read(bArr2);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        inflaterInputStream.close();
                        inflater.end();
                        return byteArray;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inflaterInputStream2 = inflaterInputStream;
                if (inflaterInputStream2 != null) {
                    inflaterInputStream2.close();
                }
                if (inflater != null) {
                    inflater.end();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inflater = null;
        }
    }

    public static final u5g b(w5g w5gVar, Function1 function1) {
        w5gVar.getClass();
        if (w5gVar instanceof u5g) {
            return (u5g) w5gVar;
        }
        if (w5gVar instanceof s5g) {
            return new u5g(function1.invoke(((s5g) w5gVar).a));
        }
        dmk.a();
        return null;
    }
}
