package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class uek extends xek {
    public final il9 d;

    public uek(il9 il9Var) {
        super(il9Var, "WALLET_MENU_REMOVE_ITEM_TAG", true);
        this.d = il9Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uek) || !Intrinsics.areEqual(this.d, ((uek) obj).d)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.xek, defpackage.ofb
    public final d3g getText() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "RemoveItem(text=" + this.d + ")";
    }
}
