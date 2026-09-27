package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.gkj;
import defpackage.hkj;
import defpackage.ib4;
import defpackage.th1;
import defpackage.z0h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "", "Lz0h;", "shape", "Lth1;", "borderStroke", "Lib4;", "color", "<init>", "(Lz0h;Lth1;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lz0h;", "component2", "()Lth1;", "component3-0d7_KjU", "()J", "component3", "copy-mxwnekA", "(Lz0h;Lth1;J)Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lz0h;", "getShape", "Lth1;", "getBorderStroke", "J", "getColor-0d7_KjU", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class TypingIndicatorStyle {
    private final th1 borderStroke;
    private final long color;
    private final z0h shape;

    private TypingIndicatorStyle(z0h z0hVar, th1 th1Var, long j) {
        z0hVar.getClass();
        this.shape = z0hVar;
        this.borderStroke = th1Var;
        this.color = j;
    }

    /* renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ TypingIndicatorStyle m278copymxwnekA$default(TypingIndicatorStyle typingIndicatorStyle, z0h z0hVar, th1 th1Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z0hVar = typingIndicatorStyle.shape;
        }
        if ((i & 2) != 0) {
            th1Var = typingIndicatorStyle.borderStroke;
        }
        if ((i & 4) != 0) {
            j = typingIndicatorStyle.color;
        }
        return typingIndicatorStyle.m280copymxwnekA(z0hVar, th1Var, j);
    }

    /* renamed from: component1, reason: from getter */
    public final z0h getShape() {
        return this.shape;
    }

    /* renamed from: component2, reason: from getter */
    public final th1 getBorderStroke() {
        return this.borderStroke;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    /* renamed from: copy-mxwnekA, reason: not valid java name */
    public final TypingIndicatorStyle m280copymxwnekA(z0h shape, th1 borderStroke, long color) {
        shape.getClass();
        return new TypingIndicatorStyle(shape, borderStroke, color, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingIndicatorStyle)) {
            return false;
        }
        TypingIndicatorStyle typingIndicatorStyle = (TypingIndicatorStyle) other;
        if (!Intrinsics.areEqual(this.shape, typingIndicatorStyle.shape) || !Intrinsics.areEqual(this.borderStroke, typingIndicatorStyle.borderStroke)) {
            return false;
        }
        long j = this.color;
        long j2 = typingIndicatorStyle.color;
        int i = ib4.n;
        if (hkj.a(j, j2)) {
            return true;
        }
        return false;
    }

    public final th1 getBorderStroke() {
        return this.borderStroke;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m281getColor0d7_KjU() {
        return this.color;
    }

    public final z0h getShape() {
        return this.shape;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.shape.hashCode() * 31;
        th1 th1Var = this.borderStroke;
        if (th1Var == null) {
            hashCode = 0;
        } else {
            hashCode = th1Var.hashCode();
        }
        int i = (hashCode2 + hashCode) * 31;
        long j = this.color;
        int i2 = ib4.n;
        gkj gkjVar = hkj.b;
        return Long.hashCode(j) + i;
    }

    public String toString() {
        return "TypingIndicatorStyle(shape=" + this.shape + ", borderStroke=" + this.borderStroke + ", color=" + ((Object) ib4.h(this.color)) + ')';
    }

    public /* synthetic */ TypingIndicatorStyle(z0h z0hVar, th1 th1Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(z0hVar, th1Var, j);
    }
}
