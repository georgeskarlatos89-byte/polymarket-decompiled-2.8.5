package defpackage;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a80 extends hh {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a80(List list, int i) {
        super(list, 1);
        this.c = i;
    }

    @Override // defpackage.i80
    public final g91 a() {
        switch (this.c) {
            case 0:
                return new nb4(this.b, 0);
            case 1:
                return new wz8(this.b, 0);
            case 2:
                return new nb4(this.b, 1);
            case 3:
                return new wz8(this.b, 1);
            case 4:
                return new wz8(this.b, 2);
            case 5:
                return new n1h(this.b);
            default:
                return new nb4(this.b, 2);
        }
    }
}
