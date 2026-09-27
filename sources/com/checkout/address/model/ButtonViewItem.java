package com.checkout.address.model;

import defpackage.i5a;
import defpackage.j5a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/checkout/address/model/ButtonViewItem;", "", "Lj5a;", "style", "Li5a;", "state", "<init>", "(Lj5a;Li5a;)V", "component1", "()Lj5a;", "component2", "()Li5a;", "copy", "(Lj5a;Li5a;)Lcom/checkout/address/model/ButtonViewItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj5a;", "getStyle", "b", "Li5a;", "getState", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ButtonViewItem {
    public static final int $stable = 0;

    /* renamed from: a, reason: from kotlin metadata */
    private final j5a style;

    /* renamed from: b, reason: from kotlin metadata */
    private final i5a state;

    public ButtonViewItem(j5a j5aVar, i5a i5aVar) {
        j5aVar.getClass();
        i5aVar.getClass();
        this.style = j5aVar;
        this.state = i5aVar;
    }

    public static /* synthetic */ ButtonViewItem copy$default(ButtonViewItem buttonViewItem, j5a j5aVar, i5a i5aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j5aVar = buttonViewItem.style;
        }
        if ((i & 2) != 0) {
            i5aVar = buttonViewItem.state;
        }
        return buttonViewItem.copy(j5aVar, i5aVar);
    }

    /* renamed from: component1, reason: from getter */
    public final j5a getStyle() {
        return this.style;
    }

    /* renamed from: component2, reason: from getter */
    public final i5a getState() {
        return this.state;
    }

    public final ButtonViewItem copy(j5a style, i5a state) {
        style.getClass();
        state.getClass();
        return new ButtonViewItem(style, state);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonViewItem)) {
            return false;
        }
        ButtonViewItem buttonViewItem = (ButtonViewItem) other;
        if (Intrinsics.areEqual(this.style, buttonViewItem.style) && Intrinsics.areEqual(this.state, buttonViewItem.state)) {
            return true;
        }
        return false;
    }

    public final i5a getState() {
        return this.state;
    }

    public final j5a getStyle() {
        return this.style;
    }

    public final int hashCode() {
        return this.state.hashCode() + (this.style.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonViewItem(style=" + this.style + ", state=" + this.state + ")";
    }
}
