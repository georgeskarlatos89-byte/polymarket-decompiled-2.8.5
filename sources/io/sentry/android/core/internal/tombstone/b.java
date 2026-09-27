package io.sentry.android.core.internal.tombstone;

import com.fingerprintjs.android.fpjs_pro_internal.f3;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.a5j;
import defpackage.amm;
import defpackage.bb3;
import defpackage.d85;
import defpackage.dk0;
import defpackage.fj1;
import defpackage.gwf;
import defpackage.hj1;
import defpackage.i4k;
import defpackage.m67;
import defpackage.ma5;
import defpackage.r31;
import defpackage.w9c;
import defpackage.x9c;
import defpackage.y9c;
import defpackage.zh4;
import io.intercom.android.sdk.models.AttributeType;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f2;
import io.sentry.h5;
import io.sentry.m;
import io.sentry.p5;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.v;
import io.sentry.transport.o;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b implements Closeable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final List d;
    public final Serializable e;
    public final Object f;

    public b(InputStream inputStream, List list, List list2, String str) {
        this.a = 0;
        HashMap hashMap = new HashMap();
        this.f = hashMap;
        this.b = inputStream;
        this.c = list;
        this.d = list2;
        this.e = str;
        hashMap.put("SIGILL", "IllegalInstruction");
        hashMap.put("SIGTRAP", "Trap");
        hashMap.put("SIGABRT", "Abort");
        hashMap.put("SIGBUS", "BusError");
        hashMap.put("SIGFPE", "FloatingPointException");
        hashMap.put("SIGSEGV", "Segfault");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((InputStream) this.b).close();
                return;
            default:
                ArrayList arrayList = (ArrayList) this.e;
                io.sentry.util.a aVar = (io.sentry.util.a) this.f;
                aVar.e();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Future) it.next()).cancel(false);
                    }
                    arrayList.clear();
                    aVar.close();
                    ((CopyOnWriteArrayList) this.d).clear();
                    return;
                } catch (Throwable th) {
                    try {
                        aVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }

    public void e(m mVar, Date date, long j) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        ArrayList arrayList = (ArrayList) this.e;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Date date2 = (Date) concurrentHashMap.get(mVar);
        if (date2 != null && !date.after(date2)) {
            return;
        }
        concurrentHashMap.put(mVar, date);
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ((o) it.next()).A(this);
        }
        io.sentry.util.a aVar = (io.sentry.util.a) this.f;
        aVar.e();
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((Future) it2.next()).isDone()) {
                    it2.remove();
                }
            }
            try {
                arrayList.add(sentryAndroidOptions.getTimerExecutorService().b(new com.appsflyer.a(this, 25), j));
            } catch (RejectedExecutionException e) {
                sentryAndroidOptions.getLogger().d(p5.WARNING, "Failed to schedule rate limit lifted notification.", e);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean g(m mVar) {
        Date date;
        Date date2 = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Date date3 = (Date) concurrentHashMap.get(m.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (!m.Unknown.equals(mVar) && (date = (Date) concurrentHashMap.get(mVar)) != null) {
            return !date2.after(date);
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0062. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, io.sentry.protocol.c0] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, io.sentry.protocol.a0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [io.sentry.protocol.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [io.sentry.protocol.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, fj1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [io.sentry.protocol.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [io.sentry.protocol.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [io.sentry.protocol.e0, java.lang.Object] */
    public h5 o() {
        Boolean j;
        boolean z;
        boolean z2;
        DebugImage j2;
        Map map;
        Iterator it;
        boolean z3;
        DebugImage j3;
        String str;
        i4k i4kVar;
        ArrayList arrayList;
        HashMap hashMap;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashMap hashMap2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashMap hashMap3;
        i4k i4kVar2;
        i4k i4kVar3;
        i4k i4kVar4;
        int i2;
        i4k i4kVar5;
        InputStream inputStream = (InputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        i4k i4kVar6 = new i4k(byteArrayOutputStream.toByteArray());
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        String str2 = "";
        int i3 = 0;
        int i4 = 0;
        String str3 = "";
        hj1 hj1Var = null;
        while (true) {
            int g = i4kVar6.g();
            if (g != 0) {
                int i5 = g >>> 3;
                int i6 = g & 7;
                String str4 = str2;
                switch (i5) {
                    case 1:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i = i4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 0, i6);
                        dk0.a((int) i4kVar.i());
                        i4 = i;
                        break;
                    case 2:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 2, i6);
                        i4kVar.f();
                        break;
                    case 3:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 2, i6);
                        i4kVar.f();
                        break;
                    case 4:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 2, i6);
                        i4kVar.f();
                        break;
                    case 5:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i = i4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 0, i6);
                        i3 = (int) i4kVar.i();
                        i4 = i;
                        break;
                    case 6:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 0, i6);
                        i4 = (int) i4kVar.i();
                        break;
                    case 7:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i = i4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 0, i6);
                        i4kVar.i();
                        i4 = i;
                        break;
                    case 8:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 2, i6);
                        i4kVar.f();
                        break;
                    case 9:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i = i4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 2, i6);
                        arrayList2.add(i4kVar.f());
                        i4 = i;
                        break;
                    case 10:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        int i7 = i4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 2, i6);
                        i4k e = i4kVar.e();
                        String str5 = str4;
                        String str6 = str5;
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            int g2 = e.g();
                            if (g2 != 0) {
                                int i10 = g2 >>> 3;
                                int i11 = g2 & 7;
                                switch (i10) {
                                    case 1:
                                        i4k.b(i10, 0, i11);
                                        i8 = (int) e.i();
                                        break;
                                    case 2:
                                        i4k.b(i10, 2, i11);
                                        str5 = e.f();
                                        break;
                                    case 3:
                                        i4k.b(i10, 0, i11);
                                        i9 = (int) e.i();
                                        break;
                                    case 4:
                                        i4k.b(i10, 2, i11);
                                        str6 = e.f();
                                        break;
                                    case 5:
                                        i4k.b(i10, 0, i11);
                                        e.c();
                                        break;
                                    case 6:
                                        i4k.b(i10, 0, i11);
                                        e.i();
                                        break;
                                    case 7:
                                        i4k.b(i10, 0, i11);
                                        e.i();
                                        break;
                                    case 8:
                                        i4k.b(i10, 0, i11);
                                        e.c();
                                        break;
                                    case 9:
                                        i4k.b(i10, 0, i11);
                                        e.i();
                                        break;
                                    case 10:
                                        i4k.b(i10, 2, i11);
                                        amm.b(e.e());
                                        break;
                                    default:
                                        e.j(i11);
                                        break;
                                }
                            } else {
                                i4 = i7;
                                hj1Var = new hj1(i8, str5, i9, str6, 7);
                                break;
                            }
                        }
                    case 11:
                    case 12:
                    case 13:
                    default:
                        i4kVar6.j(i6);
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i = i4;
                        arrayList2 = arrayList6;
                        i4 = i;
                        break;
                    case 14:
                        i4kVar = i4kVar6;
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4k.b(i5, 2, i6);
                        str3 = i4kVar.f();
                        break;
                    case 15:
                        i4kVar = i4kVar6;
                        int i12 = 2;
                        i = i4;
                        i4k.b(i5, 2, i6);
                        i4k e2 = i4kVar.e();
                        while (true) {
                            int g3 = e2.g();
                            if (g3 != 0) {
                                int i13 = g3 >>> 3;
                                int i14 = g3 & 7;
                                if (i13 != 1) {
                                    if (i13 != i12) {
                                        e2.j(i14);
                                    } else {
                                        i4k.b(i13, i12, i14);
                                        i4k e3 = e2.e();
                                        while (true) {
                                            int g4 = e3.g();
                                            if (g4 != 0) {
                                                int i15 = g4 >>> 3;
                                                int i16 = g4 & 7;
                                                ArrayList arrayList12 = arrayList7;
                                                if (i15 != 1) {
                                                    if (i15 != i12) {
                                                        if (i15 != 3) {
                                                            e3.j(i16);
                                                            arrayList5 = arrayList6;
                                                            hashMap3 = hashMap4;
                                                        } else {
                                                            i4k.b(i15, i12, i16);
                                                            i4k e4 = e3.e();
                                                            ArrayList arrayList13 = new ArrayList();
                                                            ArrayList arrayList14 = new ArrayList();
                                                            while (true) {
                                                                int g5 = e4.g();
                                                                if (g5 != 0) {
                                                                    int i17 = g5 >>> 3;
                                                                    HashMap hashMap6 = hashMap4;
                                                                    int i18 = g5 & 7;
                                                                    switch (i17) {
                                                                        case 1:
                                                                            i4kVar2 = e4;
                                                                            i4k.b(i17, 0, i18);
                                                                            i4kVar2.i();
                                                                            break;
                                                                        case 2:
                                                                            i4kVar2 = e4;
                                                                            i4k.b(i17, 0, i18);
                                                                            i4kVar2.i();
                                                                            break;
                                                                        case 3:
                                                                            i4kVar2 = e4;
                                                                            i4k.b(i17, 0, i18);
                                                                            i4kVar2.i();
                                                                            break;
                                                                        case 4:
                                                                            i4kVar2 = e4;
                                                                            i4k.b(i17, 2, i18);
                                                                            arrayList13.add(amm.a(i4kVar2.e()));
                                                                            break;
                                                                        case 5:
                                                                            i4kVar2 = e4;
                                                                            i4k.b(i17, 0, i18);
                                                                            i4kVar2.i();
                                                                            break;
                                                                        case 6:
                                                                            i4kVar2 = e4;
                                                                            i4k.b(i17, 2, i18);
                                                                            arrayList14.add(amm.a(i4kVar2.e()));
                                                                            break;
                                                                        default:
                                                                            e4.j(i18);
                                                                            i4kVar2 = e4;
                                                                            break;
                                                                    }
                                                                    e4 = i4kVar2;
                                                                    hashMap4 = hashMap6;
                                                                } else {
                                                                    hashMap3 = hashMap4;
                                                                    Collections.unmodifiableList(arrayList13);
                                                                    Collections.unmodifiableList(arrayList14);
                                                                    arrayList5 = arrayList6;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        hashMap3 = hashMap4;
                                                        i4k.b(i15, 0, i16);
                                                        arrayList5 = arrayList6;
                                                        x9c.a((int) e3.i());
                                                    }
                                                } else {
                                                    arrayList5 = arrayList6;
                                                    hashMap3 = hashMap4;
                                                    i4k.b(i15, 0, i16);
                                                    w9c.a((int) e3.i());
                                                }
                                                arrayList6 = arrayList5;
                                                arrayList7 = arrayList12;
                                                hashMap4 = hashMap3;
                                                i12 = 2;
                                            }
                                        }
                                    }
                                    arrayList3 = arrayList7;
                                    hashMap2 = hashMap4;
                                    arrayList4 = arrayList6;
                                } else {
                                    arrayList3 = arrayList7;
                                    hashMap2 = hashMap4;
                                    arrayList4 = arrayList6;
                                    i4k.b(i13, i12, i14);
                                    e2.f();
                                }
                                arrayList6 = arrayList4;
                                arrayList7 = arrayList3;
                                hashMap4 = hashMap2;
                            } else {
                                arrayList = arrayList7;
                                hashMap = hashMap4;
                                arrayList2 = arrayList6;
                                arrayList8.add(new m67(28));
                                i4 = i;
                                break;
                            }
                        }
                    case 16:
                        i4kVar = i4kVar6;
                        i = i4;
                        i4k.b(i5, 2, i6);
                        amm.c(i4kVar.e(), hashMap4);
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4 = i;
                        break;
                    case 17:
                        i4kVar = i4kVar6;
                        i = i4;
                        i4k.b(i5, 2, i6);
                        i4k e5 = i4kVar.e();
                        String str7 = str4;
                        String str8 = str7;
                        long j4 = 0;
                        long j5 = 0;
                        long j6 = 0;
                        boolean z4 = false;
                        while (true) {
                            int g6 = e5.g();
                            if (g6 != 0) {
                                int i19 = g6 >>> 3;
                                int i20 = g6 & 7;
                                switch (i19) {
                                    case 1:
                                        i4k.b(i19, 0, i20);
                                        j4 = e5.i();
                                        break;
                                    case 2:
                                        i4k.b(i19, 0, i20);
                                        j5 = e5.i();
                                        break;
                                    case 3:
                                        i4k.b(i19, 0, i20);
                                        j6 = e5.i();
                                        break;
                                    case 4:
                                        i4k.b(i19, 0, i20);
                                        z4 = e5.c();
                                        break;
                                    case 5:
                                        i4k.b(i19, 0, i20);
                                        e5.c();
                                        break;
                                    case 6:
                                        i4k.b(i19, 0, i20);
                                        e5.c();
                                        break;
                                    case 7:
                                        i4k.b(i19, 2, i20);
                                        str7 = e5.f();
                                        break;
                                    case 8:
                                        i4k.b(i19, 2, i20);
                                        str8 = e5.f();
                                        break;
                                    case 9:
                                        i4k.b(i19, 0, i20);
                                        e5.i();
                                        break;
                                    default:
                                        e5.j(i20);
                                        break;
                                }
                            } else {
                                arrayList9.add(new y9c(j4, j5, j6, str7, str8, z4));
                                arrayList = arrayList7;
                                hashMap = hashMap4;
                                arrayList2 = arrayList6;
                                i4 = i;
                                break;
                            }
                        }
                    case MlKitException.UNSUPPORTED /* 18 */:
                        i4kVar = i4kVar6;
                        i = i4;
                        i4k.b(i5, 2, i6);
                        i4k e6 = i4kVar.e();
                        ArrayList arrayList15 = new ArrayList();
                        while (true) {
                            int g7 = e6.g();
                            if (g7 != 0) {
                                int i21 = g7 >>> 3;
                                int i22 = g7 & 7;
                                if (i21 != 1) {
                                    if (i21 != 2) {
                                        e6.j(i22);
                                        i4kVar3 = e6;
                                    } else {
                                        i4k.b(i21, 2, i22);
                                        i4k e7 = e6.e();
                                        while (true) {
                                            int g8 = e7.g();
                                            if (g8 != 0) {
                                                int i23 = g8 >>> 3;
                                                int i24 = g8 & 7;
                                                switch (i23) {
                                                    case 1:
                                                        i4kVar4 = e6;
                                                        i4k.b(i23, 2, i24);
                                                        e7.f();
                                                        break;
                                                    case 2:
                                                        i4kVar4 = e6;
                                                        i4k.b(i23, 0, i24);
                                                        e7.i();
                                                        break;
                                                    case 3:
                                                        i4kVar4 = e6;
                                                        i4k.b(i23, 0, i24);
                                                        e7.i();
                                                        break;
                                                    case 4:
                                                        i4kVar4 = e6;
                                                        i4k.b(i23, 0, i24);
                                                        e7.i();
                                                        break;
                                                    case 5:
                                                        i4kVar4 = e6;
                                                        i4k.b(i23, 2, i24);
                                                        e7.f();
                                                        break;
                                                    case 6:
                                                        i4kVar4 = e6;
                                                        i4k.b(i23, 2, i24);
                                                        e7.f();
                                                        break;
                                                    default:
                                                        e7.j(i24);
                                                        i4kVar4 = e6;
                                                        break;
                                                }
                                                e6 = i4kVar4;
                                            } else {
                                                i4kVar3 = e6;
                                                arrayList15.add(new ma5(13));
                                            }
                                        }
                                    }
                                } else {
                                    i4kVar3 = e6;
                                    i4k.b(i21, 2, i22);
                                    i4kVar3.f();
                                }
                                e6 = i4kVar3;
                            } else {
                                arrayList10.add(new bb3(arrayList15));
                                arrayList = arrayList7;
                                hashMap = hashMap4;
                                arrayList2 = arrayList6;
                                i4 = i;
                                break;
                            }
                        }
                    case zh4.REMOTE_EXCEPTION /* 19 */:
                        i4kVar = i4kVar6;
                        int i25 = 2;
                        i = i4;
                        i4k.b(i5, 2, i6);
                        i4k e8 = i4kVar.e();
                        while (true) {
                            int g9 = e8.g();
                            if (g9 != 0) {
                                int i26 = g9 >>> 3;
                                int i27 = g9 & 7;
                                if (i26 != 1) {
                                    if (i26 != i25) {
                                        if (i26 != 3) {
                                            if (i26 != 4) {
                                                e8.j(i27);
                                            } else {
                                                i4k.b(i26, 0, i27);
                                                e8.i();
                                            }
                                        } else {
                                            i4k.b(i26, i25, i27);
                                            e8.f();
                                        }
                                    } else {
                                        i4k.b(i26, i25, i27);
                                        e8.f();
                                    }
                                } else {
                                    i4k.b(i26, 0, i27);
                                    e8.i();
                                }
                                i25 = 2;
                            } else {
                                arrayList11.add(new d85(7));
                                arrayList = arrayList7;
                                hashMap = hashMap4;
                                arrayList2 = arrayList6;
                                i4 = i;
                                break;
                            }
                        }
                    case 20:
                        i4kVar = i4kVar6;
                        i2 = i4;
                        i4k.b(i5, 0, i6);
                        i4kVar.i();
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i4 = i2;
                        arrayList2 = arrayList6;
                        break;
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        i4kVar = i4kVar6;
                        i = i4;
                        i4k.b(i5, 2, i6);
                        i4k e9 = i4kVar.e();
                        while (true) {
                            int g10 = e9.g();
                            if (g10 != 0) {
                                int i28 = g10 >>> 3;
                                int i29 = g10 & 7;
                                if (i28 != 1) {
                                    if (i28 != 2) {
                                        e9.j(i29);
                                    } else {
                                        i4k.b(i28, 2, i29);
                                        e9.d();
                                    }
                                } else {
                                    i4k.b(i28, 2, i29);
                                    e9.d();
                                }
                            } else {
                                arrayList7.add(new ma5(0));
                                arrayList = arrayList7;
                                hashMap = hashMap4;
                                arrayList2 = arrayList6;
                                i4 = i;
                                break;
                            }
                        }
                    case 22:
                        i4kVar = i4kVar6;
                        i2 = i4;
                        i4k.b(i5, 0, i6);
                        i4kVar.i();
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i4 = i2;
                        arrayList2 = arrayList6;
                        break;
                    case 23:
                        i4kVar = i4kVar6;
                        i2 = i4;
                        i4k.b(i5, 0, i6);
                        i4kVar.c();
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i4 = i2;
                        arrayList2 = arrayList6;
                        break;
                    case 24:
                        i4kVar = i4kVar6;
                        i2 = i4;
                        i4k.b(i5, 0, i6);
                        dk0.a((int) i4kVar.i());
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        i4 = i2;
                        arrayList2 = arrayList6;
                        break;
                    case 25:
                        i4kVar = i4kVar6;
                        i = i4;
                        i4k.b(i5, 2, i6);
                        amm.c(i4kVar.e(), hashMap5);
                        arrayList = arrayList7;
                        hashMap = hashMap4;
                        arrayList2 = arrayList6;
                        i4 = i;
                        break;
                    case 26:
                        i4k.b(i5, 2, i6);
                        i4k e10 = i4kVar6.e();
                        ArrayList arrayList16 = new ArrayList();
                        while (true) {
                            int g11 = e10.g();
                            if (g11 != 0) {
                                int i30 = g11 >>> 3;
                                i4k i4kVar7 = i4kVar6;
                                int i31 = g11 & 7;
                                int i32 = i4;
                                if (i30 != 1) {
                                    if (i30 != 2) {
                                        e10.j(i31);
                                        i4kVar5 = e10;
                                    } else {
                                        i4k.b(i30, 2, i31);
                                        i4k e11 = e10.e();
                                        while (true) {
                                            int g12 = e11.g();
                                            if (g12 != 0) {
                                                int i33 = g12 >>> 3;
                                                int i34 = g12 & 7;
                                                i4k i4kVar8 = e10;
                                                if (i33 != 1) {
                                                    if (i33 != 2) {
                                                        if (i33 != 3) {
                                                            e11.j(i34);
                                                        } else {
                                                            i4k.b(i33, 0, i34);
                                                            e11.i();
                                                        }
                                                    } else {
                                                        i4k.b(i33, 0, i34);
                                                        e11.i();
                                                    }
                                                } else {
                                                    i4k.b(i33, 2, i34);
                                                    amm.a(e11.e());
                                                }
                                                e10 = i4kVar8;
                                            } else {
                                                i4kVar5 = e10;
                                                arrayList16.add(new Object());
                                            }
                                        }
                                    }
                                } else {
                                    i4kVar5 = e10;
                                    i4k.b(i30, 0, i31);
                                    i4kVar5.i();
                                }
                                e10 = i4kVar5;
                                i4kVar6 = i4kVar7;
                                i4 = i32;
                            } else {
                                i4kVar = i4kVar6;
                                i2 = i4;
                                Collections.unmodifiableList(arrayList16);
                                arrayList = arrayList7;
                                hashMap = hashMap4;
                                i4 = i2;
                                arrayList2 = arrayList6;
                                break;
                            }
                        }
                }
                arrayList6 = arrayList2;
                str2 = str4;
                i4kVar6 = i4kVar;
                arrayList7 = arrayList;
                hashMap4 = hashMap;
            } else {
                String str9 = str2;
                int i35 = i4;
                List unmodifiableList = Collections.unmodifiableList(arrayList6);
                Collections.unmodifiableList(arrayList7);
                Collections.unmodifiableList(arrayList8);
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap4);
                Collections.unmodifiableMap(hashMap5);
                List unmodifiableList2 = Collections.unmodifiableList(arrayList9);
                Collections.unmodifiableList(arrayList10);
                Collections.unmodifiableList(arrayList11);
                h5 h5Var = new h5();
                h5Var.u = p5.FATAL;
                h5Var.h = "native";
                ?? obj = new Object();
                String join = String.join(ApiConstant.SPACE, unmodifiableList);
                if (hj1Var != null) {
                    Locale locale = Locale.ROOT;
                    if (!str3.isEmpty()) {
                        str = str3.concat(": ");
                    } else {
                        str = str9;
                    }
                    obj.a = str + "Fatal signal " + ((String) hj1Var.d) + " (" + hj1Var.b + "), " + ((String) hj1Var.e) + " (" + hj1Var.c + "), pid = " + i3 + " (" + join + ")";
                } else {
                    Locale locale2 = Locale.ROOT;
                    obj.a = "Fatal exit pid = " + i3 + " (" + join + ")";
                }
                h5Var.q = obj;
                ArrayList arrayList17 = new ArrayList();
                Iterator it2 = unmodifiableList2.iterator();
                fj1 fj1Var = null;
                while (it2.hasNext()) {
                    y9c y9cVar = (y9c) it2.next();
                    boolean z5 = y9cVar.d;
                    String str10 = y9cVar.f;
                    String str11 = y9cVar.e;
                    long j7 = y9cVar.b;
                    if (!z5 || str11.isEmpty() || str11.startsWith("/dev/")) {
                        map = unmodifiableMap;
                        it = it2;
                    } else {
                        boolean isEmpty = str10.isEmpty();
                        map = unmodifiableMap;
                        it = it2;
                        if (y9cVar.c == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!isEmpty && z3) {
                            if (fj1Var != null && str11.equals((String) fj1Var.c)) {
                                fj1Var.b = j7;
                            } else {
                                if (fj1Var != null && (j3 = fj1Var.j()) != null) {
                                    arrayList17.add(j3);
                                }
                                ?? obj2 = new Object();
                                obj2.c = str11;
                                obj2.d = str10;
                                obj2.a = y9cVar.a;
                                obj2.b = j7;
                                fj1Var = obj2;
                            }
                        } else if (fj1Var != null && str11.equals((String) fj1Var.c)) {
                            fj1Var.b = j7;
                        }
                    }
                    unmodifiableMap = map;
                    it2 = it;
                }
                Map map2 = unmodifiableMap;
                if (fj1Var != null && (j2 = fj1Var.j()) != null) {
                    arrayList17.add(j2);
                }
                ?? obj3 = new Object();
                obj3.b(arrayList17);
                h5Var.n = obj3;
                ?? obj4 = new Object();
                if (hj1Var != null) {
                    String str12 = (String) hj1Var.d;
                    obj4.a = str12;
                    obj4.b = (String) ((HashMap) this.f).get(str12);
                    ?? obj5 = new Object();
                    obj5.a = a.TOMBSTONE.getValue();
                    obj5.d = Boolean.FALSE;
                    obj5.g = Boolean.TRUE;
                    HashMap hashMap7 = new HashMap();
                    hashMap7.put(AttributeType.NUMBER, Integer.valueOf(hj1Var.b));
                    hashMap7.put(Keys.KEY_NAME, (String) hj1Var.d);
                    hashMap7.put(ApiConstant.KEY_CODE, Integer.valueOf(hj1Var.c));
                    hashMap7.put("code_name", (String) hj1Var.e);
                    obj5.e = new HashMap(hashMap7);
                    obj4.f = obj5;
                }
                obj4.d = Long.valueOf(i35);
                ArrayList arrayList18 = new ArrayList(1);
                arrayList18.add(obj4);
                h5Var.t = new f2(arrayList18);
                ArrayList d = h5Var.d();
                Objects.requireNonNull(d);
                v vVar = (v) d.get(0);
                ArrayList arrayList19 = new ArrayList();
                Iterator it3 = map2.entrySet().iterator();
                while (it3.hasNext()) {
                    a5j a5jVar = (a5j) ((Map.Entry) it3.next()).getValue();
                    ?? obj6 = new Object();
                    obj6.a = Long.valueOf(((Integer) r5.getKey()).intValue());
                    obj6.c = a5jVar.b;
                    ArrayList arrayList20 = new ArrayList();
                    Iterator it4 = a5jVar.f.iterator();
                    while (it4.hasNext()) {
                        r31 r31Var = (r31) it4.next();
                        String str13 = r31Var.c;
                        String str14 = r31Var.b;
                        if (!str13.endsWith("libart.so") && (!str13.startsWith("<anonymous") || !str14.isEmpty())) {
                            ?? obj7 = new Object();
                            obj7.l = str13;
                            obj7.e = str14;
                            Iterator it5 = it4;
                            obj7.q = String.format("0x%x", Long.valueOf(r31Var.a));
                            if (str14.isEmpty()) {
                                j = Boolean.FALSE;
                            } else {
                                j = f3.j(str14, (List) this.c, this.d);
                            }
                            String str15 = (String) this.e;
                            if (str15 != null && str13.startsWith(str15)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if ((j != null && j.booleanValue()) || z) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            obj7.k = Boolean.valueOf(z2);
                            arrayList20.add(0, obj7);
                            it4 = it5;
                        }
                    }
                    ?? obj8 = new Object();
                    obj8.a = arrayList20;
                    obj8.d = b0.NONE;
                    HashMap hashMap8 = new HashMap();
                    c0 c0Var = obj8;
                    for (gwf gwfVar : a5jVar.c) {
                        hashMap8.put(gwfVar.a, String.format("0x%x", Long.valueOf(gwfVar.b)));
                        c0Var = c0Var;
                    }
                    c0 c0Var2 = c0Var;
                    c0Var2.b = hashMap8;
                    obj6.i = c0Var2;
                    int i36 = a5jVar.a;
                    if (i35 == i36) {
                        obj6.e = Boolean.TRUE;
                        vVar.e = c0Var2;
                    }
                    if (i3 == i36) {
                        obj6.c = "main";
                        obj6.h = Boolean.TRUE;
                    }
                    arrayList19.add(obj6);
                }
                h5Var.s = new f2(arrayList19);
                return h5Var;
            }
        }
    }

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this.a = 1;
        this.c = new ConcurrentHashMap();
        this.d = new CopyOnWriteArrayList();
        this.e = new ArrayList();
        this.f = new Object();
        this.b = sentryAndroidOptions;
    }
}
