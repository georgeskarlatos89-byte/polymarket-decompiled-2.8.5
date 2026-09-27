package kotlin.io;

import defpackage.at7;
import defpackage.g18;
import defpackage.nin;
import defpackage.uon;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;

@Metadata(d1 = {"f18", "kotlin/io/FilesKt__FileReadWriteKt", "kotlin/io/a", "g18"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class FilesKt extends g18 {
    public static byte[] g(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        at7 at7Var = new at7(8193, 0);
                        at7Var.write(read2);
                        nin.a(fileInputStream, at7Var);
                        int size = at7Var.size() + i;
                        if (size >= 0) {
                            byte[] g = at7Var.g();
                            bArr = Arrays.copyOf(bArr, size);
                            ArraysKt.m(g, i, bArr, 0, at7Var.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                fileInputStream.close();
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                uon.b(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ String h(File file) {
        return FilesKt__FileReadWriteKt.readText$default(file, null, 1, null);
    }

    public static void i(File file, String str) {
        Charset charset = Charsets.UTF_8;
        file.getClass();
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FilesKt__FileReadWriteKt.a(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }
}
