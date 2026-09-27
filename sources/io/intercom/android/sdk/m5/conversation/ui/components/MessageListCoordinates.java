package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.d9h;
import defpackage.zrf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "", "Lzrf;", "boundsInParent", "boundsInWindow", "Ld9h;", "size", "<init>", "(Lzrf;Lzrf;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isZero", "()Z", "component1", "()Lzrf;", "component2", "component3-NH-jbRc", "()J", "component3", "copy-cSwnlzA", "(Lzrf;Lzrf;J)Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzrf;", "getBoundsInParent", "getBoundsInWindow", "J", "getSize-NH-jbRc", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* data */ class MessageListCoordinates {
    private final zrf boundsInParent;
    private final zrf boundsInWindow;
    private final long size;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageListCoordinates(zrf zrfVar, zrf zrfVar2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r7 != 0 ? r0 : zrfVar, (i & 2) != 0 ? r0 : zrfVar2, (i & 4) != 0 ? 0L : j, null);
        int i2 = i & 1;
        zrf zrfVar3 = zrf.e;
    }

    /* renamed from: copy-cSwnlzA$default, reason: not valid java name */
    public static /* synthetic */ MessageListCoordinates m187copycSwnlzA$default(MessageListCoordinates messageListCoordinates, zrf zrfVar, zrf zrfVar2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            zrfVar = messageListCoordinates.boundsInParent;
        }
        if ((i & 2) != 0) {
            zrfVar2 = messageListCoordinates.boundsInWindow;
        }
        if ((i & 4) != 0) {
            j = messageListCoordinates.size;
        }
        return messageListCoordinates.m189copycSwnlzA(zrfVar, zrfVar2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final zrf getBoundsInParent() {
        return this.boundsInParent;
    }

    /* renamed from: component2, reason: from getter */
    public final zrf getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* renamed from: component3-NH-jbRc, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: copy-cSwnlzA, reason: not valid java name */
    public final MessageListCoordinates m189copycSwnlzA(zrf boundsInParent, zrf boundsInWindow, long size) {
        boundsInParent.getClass();
        boundsInWindow.getClass();
        return new MessageListCoordinates(boundsInParent, boundsInWindow, size, null);
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof MessageListCoordinates) {
                MessageListCoordinates messageListCoordinates = (MessageListCoordinates) other;
                if (!Intrinsics.areEqual(this.boundsInParent, messageListCoordinates.boundsInParent) || !Intrinsics.areEqual(this.boundsInWindow, messageListCoordinates.boundsInWindow) || !d9h.b(this.size, messageListCoordinates.size)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final zrf getBoundsInParent() {
        return this.boundsInParent;
    }

    public final zrf getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m190getSizeNHjbRc() {
        return this.size;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + ((this.boundsInWindow.hashCode() + (this.boundsInParent.hashCode() * 31)) * 31);
    }

    public final boolean isZero() {
        if (Intrinsics.areEqual(this.boundsInParent, zrf.e) && d9h.b(this.size, 0L)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "MessageListCoordinates(boundsInParent=" + this.boundsInParent + ", boundsInWindow=" + this.boundsInWindow + ", size=" + ((Object) d9h.g(this.size)) + ')';
    }

    private MessageListCoordinates(zrf zrfVar, zrf zrfVar2, long j) {
        zrfVar.getClass();
        zrfVar2.getClass();
        this.boundsInParent = zrfVar;
        this.boundsInWindow = zrfVar2;
        this.size = j;
    }

    public /* synthetic */ MessageListCoordinates(zrf zrfVar, zrf zrfVar2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(zrfVar, zrfVar2, j);
    }
}
