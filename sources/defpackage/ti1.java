package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ti1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v2, types: [otf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zkg zkgVar, float f, qjh qjhVar, Continuation continuation) {
        bkg bkgVar;
        int i;
        otf otfVar;
        if (continuation instanceof bkg) {
            bkg bkgVar2 = (bkg) continuation;
            int i2 = bkgVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bkgVar2.m = i2 - Integer.MIN_VALUE;
                bkgVar = bkgVar2;
                Object obj = bkgVar.l;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = bkgVar.m;
                if (i == 0) {
                    if (i == 1) {
                        otfVar = bkgVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ?? obj3 = new Object();
                    Function2 zqfVar = new zqf(f, qjhVar, (otf) obj3, (Continuation) null);
                    bkgVar.k = obj3;
                    bkgVar.m = 1;
                    if (zkgVar.a(drc.Default, zqfVar, bkgVar) == obj2) {
                        return obj2;
                    }
                    otfVar = obj3;
                }
                return new Float(otfVar.a);
            }
        }
        bkgVar = new q55(continuation);
        Object obj4 = bkgVar.l;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = bkgVar.m;
        if (i == 0) {
        }
        return new Float(otfVar.a);
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(ti1.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static byte[] c(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] d(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                dmk.n(ace.f(i, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] e(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    try {
                        i4 += inflater.inflate(bArr, i4, i2 - i4);
                        i3 += read;
                    } catch (DataFormatException e) {
                        throw new IllegalStateException(e.getMessage());
                    }
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long f(InputStream inputStream, int i) {
        byte[] d = d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (d[i2] & MessagePack.Code.EXT_TIMESTAMP) << (i2 * 8);
        }
        return j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(Function0 function0, Function2 function2, q55 q55Var) {
        oq oqVar;
        int i;
        if (q55Var instanceof oq) {
            oq oqVar2 = (oq) q55Var;
            int i2 = oqVar2.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oqVar2.l = i2 - Integer.MIN_VALUE;
                oqVar = oqVar2;
                Object obj = oqVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = oqVar.l;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    yq yqVar = new yq(function0, function2, null);
                    oqVar.l = 1;
                    if (qsn.f(yqVar, oqVar) == u85Var) {
                        return u85Var;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        oqVar = new q55(q55Var);
        Object obj2 = oqVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = oqVar.l;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v2, types: [otf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(zkg zkgVar, float f, q55 q55Var) {
        ckg ckgVar;
        int i;
        otf otfVar;
        if (q55Var instanceof ckg) {
            ckg ckgVar2 = (ckg) q55Var;
            int i2 = ckgVar2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ckgVar2.m = i2 - Integer.MIN_VALUE;
                ckgVar = ckgVar2;
                Object obj = ckgVar.l;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = ckgVar.m;
                if (i == 0) {
                    if (i == 1) {
                        otfVar = ckgVar.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    ?? obj3 = new Object();
                    Function2 dkgVar = new dkg(obj3, f, null);
                    ckgVar.k = obj3;
                    ckgVar.m = 1;
                    if (zkgVar.a(drc.Default, dkgVar, ckgVar) == obj2) {
                        return obj2;
                    }
                    otfVar = obj3;
                }
                return new Float(otfVar.a);
            }
        }
        ckgVar = new q55(q55Var);
        Object obj4 = ckgVar.l;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = ckgVar.m;
        if (i == 0) {
        }
        return new Float(otfVar.a);
    }

    public static void i(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, int i) {
        i(byteArrayOutputStream, i, 2);
    }
}
