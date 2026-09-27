package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class tjh extends c26 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tjh(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // defpackage.c26
    public final Date a(Date date) {
        switch (this.b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
