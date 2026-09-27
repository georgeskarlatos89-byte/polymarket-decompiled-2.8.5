package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.e;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class nin {
    public static final long a(InputStream inputStream, OutputStream outputStream) {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static final Class b(SerialDescriptor serialDescriptor) {
        String s = e.s(serialDescriptor.h(), "?", "");
        try {
            return Class.forName(s);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.L(s, ".", false)) {
                return Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(s, "\\$"));
            }
            String str = "Cannot find class with name \"" + serialDescriptor.h() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.getKind() instanceof cxg) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            dmk.v(str);
            return null;
        }
    }

    public static final byte[] c(InputStream inputStream) {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        a(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
