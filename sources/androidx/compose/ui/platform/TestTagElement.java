package androidx.compose.ui.platform;

import defpackage.hqi;
import defpackage.jjc;
import defpackage.qjc;
import defpackage.zz9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "Lqjc;", "Lhqi;", "", "tag", "<init>", "(Ljava/lang/String;)V", "create", "()Lhqi;", "node", "", "update", "(Lhqi;)V", "Lzz9;", "inspectableProperties", "(Lzz9;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TestTagElement extends qjc {
    private final String tag;

    public TestTagElement(String str) {
        this.tag = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hqi, jjc] */
    @Override // defpackage.qjc
    public hqi create() {
        String str = this.tag;
        ?? jjcVar = new jjc();
        jjcVar.o = str;
        return jjcVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestTagElement)) {
            return false;
        }
        return Intrinsics.areEqual(this.tag, ((TestTagElement) other).tag);
    }

    public int hashCode() {
        return this.tag.hashCode();
    }

    @Override // defpackage.qjc
    public void inspectableProperties(zz9 zz9Var) {
        zz9Var.a = "testTag";
        zz9Var.c.c(this.tag, "tag");
    }

    @Override // defpackage.qjc
    public /* bridge */ /* synthetic */ void update(jjc jjcVar) {
        update((hqi) jjcVar);
    }

    public void update(hqi node) {
        node.o = this.tag;
    }

    @Override // defpackage.qjc
    public /* bridge */ /* synthetic */ jjc create() {
        return create();
    }
}
