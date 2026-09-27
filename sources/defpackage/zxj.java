package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = dyj.class)
/* loaded from: classes6.dex */
public final class zxj implements Serializable {
    public static final xxj Companion = new Object();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final Lazy f;
    public final ykj g;
    public final ykj h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;

    public zxj(ykj ykjVar, String str, int i, ArrayList arrayList, wud wudVar, String str2, String str3, String str4, String str5) {
        wudVar.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        if (i >= 0 && i < 65536) {
            this.f = LazyKt.lazy(new u71(6, arrayList));
            this.g = ykjVar;
            this.h = ykjVar == null ? ykj.c : ykjVar;
            this.i = LazyKt.lazy(new mmj(14, arrayList, this));
            final int i2 = 0;
            this.j = LazyKt.lazy(new Function0(this) { // from class: wxj
                public final /* synthetic */ zxj b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = i2;
                    zxj zxjVar = this.b;
                    switch (i3) {
                        case 0:
                            String str6 = zxjVar.e;
                            int Q = StringsKt.Q(str6, '?', 0, 6) + 1;
                            if (Q == 0) {
                                return "";
                            }
                            int Q2 = StringsKt.Q(str6, '#', Q, 4);
                            if (Q2 == -1) {
                                return str6.substring(Q);
                            }
                            return str6.substring(Q, Q2);
                        case 1:
                            String str7 = zxjVar.e;
                            int Q3 = StringsKt.Q(str7, '/', zxjVar.h.a.length() + 3, 4);
                            if (Q3 == -1) {
                                return "";
                            }
                            int Q4 = StringsKt.Q(str7, '#', Q3, 4);
                            if (Q4 == -1) {
                                return str7.substring(Q3);
                            }
                            return str7.substring(Q3, Q4);
                        case 2:
                            String str8 = zxjVar.e;
                            String str9 = zxjVar.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = zxjVar.h.a.length() + 3;
                            return str8.substring(length, StringsKt.S(str8, new char[]{':', '@'}, length));
                        case 3:
                            String str10 = zxjVar.e;
                            String str11 = zxjVar.d;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(StringsKt.Q(str10, ':', zxjVar.h.a.length() + 3, 4) + 1, StringsKt.Q(str10, '@', 0, 6));
                        default:
                            String str12 = zxjVar.e;
                            int Q5 = StringsKt.Q(str12, '#', 0, 6) + 1;
                            if (Q5 == 0) {
                                return "";
                            }
                            return str12.substring(Q5);
                    }
                }
            });
            final int i3 = 1;
            this.k = LazyKt.lazy(new Function0(this) { // from class: wxj
                public final /* synthetic */ zxj b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i3;
                    zxj zxjVar = this.b;
                    switch (i32) {
                        case 0:
                            String str6 = zxjVar.e;
                            int Q = StringsKt.Q(str6, '?', 0, 6) + 1;
                            if (Q == 0) {
                                return "";
                            }
                            int Q2 = StringsKt.Q(str6, '#', Q, 4);
                            if (Q2 == -1) {
                                return str6.substring(Q);
                            }
                            return str6.substring(Q, Q2);
                        case 1:
                            String str7 = zxjVar.e;
                            int Q3 = StringsKt.Q(str7, '/', zxjVar.h.a.length() + 3, 4);
                            if (Q3 == -1) {
                                return "";
                            }
                            int Q4 = StringsKt.Q(str7, '#', Q3, 4);
                            if (Q4 == -1) {
                                return str7.substring(Q3);
                            }
                            return str7.substring(Q3, Q4);
                        case 2:
                            String str8 = zxjVar.e;
                            String str9 = zxjVar.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = zxjVar.h.a.length() + 3;
                            return str8.substring(length, StringsKt.S(str8, new char[]{':', '@'}, length));
                        case 3:
                            String str10 = zxjVar.e;
                            String str11 = zxjVar.d;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(StringsKt.Q(str10, ':', zxjVar.h.a.length() + 3, 4) + 1, StringsKt.Q(str10, '@', 0, 6));
                        default:
                            String str12 = zxjVar.e;
                            int Q5 = StringsKt.Q(str12, '#', 0, 6) + 1;
                            if (Q5 == 0) {
                                return "";
                            }
                            return str12.substring(Q5);
                    }
                }
            });
            final int i4 = 2;
            this.l = LazyKt.lazy(new Function0(this) { // from class: wxj
                public final /* synthetic */ zxj b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i4;
                    zxj zxjVar = this.b;
                    switch (i32) {
                        case 0:
                            String str6 = zxjVar.e;
                            int Q = StringsKt.Q(str6, '?', 0, 6) + 1;
                            if (Q == 0) {
                                return "";
                            }
                            int Q2 = StringsKt.Q(str6, '#', Q, 4);
                            if (Q2 == -1) {
                                return str6.substring(Q);
                            }
                            return str6.substring(Q, Q2);
                        case 1:
                            String str7 = zxjVar.e;
                            int Q3 = StringsKt.Q(str7, '/', zxjVar.h.a.length() + 3, 4);
                            if (Q3 == -1) {
                                return "";
                            }
                            int Q4 = StringsKt.Q(str7, '#', Q3, 4);
                            if (Q4 == -1) {
                                return str7.substring(Q3);
                            }
                            return str7.substring(Q3, Q4);
                        case 2:
                            String str8 = zxjVar.e;
                            String str9 = zxjVar.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = zxjVar.h.a.length() + 3;
                            return str8.substring(length, StringsKt.S(str8, new char[]{':', '@'}, length));
                        case 3:
                            String str10 = zxjVar.e;
                            String str11 = zxjVar.d;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(StringsKt.Q(str10, ':', zxjVar.h.a.length() + 3, 4) + 1, StringsKt.Q(str10, '@', 0, 6));
                        default:
                            String str12 = zxjVar.e;
                            int Q5 = StringsKt.Q(str12, '#', 0, 6) + 1;
                            if (Q5 == 0) {
                                return "";
                            }
                            return str12.substring(Q5);
                    }
                }
            });
            final int i5 = 3;
            this.m = LazyKt.lazy(new Function0(this) { // from class: wxj
                public final /* synthetic */ zxj b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i5;
                    zxj zxjVar = this.b;
                    switch (i32) {
                        case 0:
                            String str6 = zxjVar.e;
                            int Q = StringsKt.Q(str6, '?', 0, 6) + 1;
                            if (Q == 0) {
                                return "";
                            }
                            int Q2 = StringsKt.Q(str6, '#', Q, 4);
                            if (Q2 == -1) {
                                return str6.substring(Q);
                            }
                            return str6.substring(Q, Q2);
                        case 1:
                            String str7 = zxjVar.e;
                            int Q3 = StringsKt.Q(str7, '/', zxjVar.h.a.length() + 3, 4);
                            if (Q3 == -1) {
                                return "";
                            }
                            int Q4 = StringsKt.Q(str7, '#', Q3, 4);
                            if (Q4 == -1) {
                                return str7.substring(Q3);
                            }
                            return str7.substring(Q3, Q4);
                        case 2:
                            String str8 = zxjVar.e;
                            String str9 = zxjVar.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = zxjVar.h.a.length() + 3;
                            return str8.substring(length, StringsKt.S(str8, new char[]{':', '@'}, length));
                        case 3:
                            String str10 = zxjVar.e;
                            String str11 = zxjVar.d;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(StringsKt.Q(str10, ':', zxjVar.h.a.length() + 3, 4) + 1, StringsKt.Q(str10, '@', 0, 6));
                        default:
                            String str12 = zxjVar.e;
                            int Q5 = StringsKt.Q(str12, '#', 0, 6) + 1;
                            if (Q5 == 0) {
                                return "";
                            }
                            return str12.substring(Q5);
                    }
                }
            });
            final int i6 = 4;
            this.n = LazyKt.lazy(new Function0(this) { // from class: wxj
                public final /* synthetic */ zxj b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i32 = i6;
                    zxj zxjVar = this.b;
                    switch (i32) {
                        case 0:
                            String str6 = zxjVar.e;
                            int Q = StringsKt.Q(str6, '?', 0, 6) + 1;
                            if (Q == 0) {
                                return "";
                            }
                            int Q2 = StringsKt.Q(str6, '#', Q, 4);
                            if (Q2 == -1) {
                                return str6.substring(Q);
                            }
                            return str6.substring(Q, Q2);
                        case 1:
                            String str7 = zxjVar.e;
                            int Q3 = StringsKt.Q(str7, '/', zxjVar.h.a.length() + 3, 4);
                            if (Q3 == -1) {
                                return "";
                            }
                            int Q4 = StringsKt.Q(str7, '#', Q3, 4);
                            if (Q4 == -1) {
                                return str7.substring(Q3);
                            }
                            return str7.substring(Q3, Q4);
                        case 2:
                            String str8 = zxjVar.e;
                            String str9 = zxjVar.c;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = zxjVar.h.a.length() + 3;
                            return str8.substring(length, StringsKt.S(str8, new char[]{':', '@'}, length));
                        case 3:
                            String str10 = zxjVar.e;
                            String str11 = zxjVar.d;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(StringsKt.Q(str10, ':', zxjVar.h.a.length() + 3, 4) + 1, StringsKt.Q(str10, '@', 0, 6));
                        default:
                            String str12 = zxjVar.e;
                            int Q5 = StringsKt.Q(str12, '#', 0, 6) + 1;
                            if (Q5 == 0) {
                                return "";
                            }
                            return str12.substring(Q5);
                    }
                }
            });
            return;
        }
        f27.q(ace.f(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zxj.class == obj.getClass()) {
            return Intrinsics.areEqual(this.e, ((zxj) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }
}
