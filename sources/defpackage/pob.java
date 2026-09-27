package defpackage;

import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg(with = tob.class)
/* loaded from: classes6.dex */
public final class pob implements Comparable<pob>, Serializable {
    public static final nob Companion = new Object();
    public final LocalDate a;

    /* JADX WARN: Type inference failed for: r0v0, types: [nob, java.lang.Object] */
    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new pob(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new pob(localDate2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pob(int i, int i2, int i3) {
        this(r1);
        try {
            LocalDate of = LocalDate.of(i, i2, i3);
            of.getClass();
        } catch (DateTimeException e) {
            xbc.s(e);
            throw null;
        }
    }

    public final lkc a() {
        Month month = this.a.getMonth();
        month.getClass();
        month.getClass();
        return (lkc) lkc.a().get(month.getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(pob pobVar) {
        pob pobVar2 = pobVar;
        pobVar2.getClass();
        return this.a.compareTo((ChronoLocalDate) pobVar2.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pob) {
                if (!Intrinsics.areEqual(this.a, ((pob) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String localDate = this.a.toString();
        localDate.getClass();
        return localDate;
    }

    public pob(LocalDate localDate) {
        localDate.getClass();
        this.a = localDate;
    }
}
