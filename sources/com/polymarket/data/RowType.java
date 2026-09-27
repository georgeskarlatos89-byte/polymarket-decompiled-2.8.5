package com.polymarket.data;

import io.intercom.android.sdk.models.carousel.ActionType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/polymarket/data/RowType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "isToggle", "", "()Z", "Swift_isToggle", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "DefaultCase", "SecondaryLeftCase", "LinkCase", "DestructiveCase", "ToggleCase", "RadioCase", "Companion", "Lcom/polymarket/data/RowType$DefaultCase;", "Lcom/polymarket/data/RowType$DestructiveCase;", "Lcom/polymarket/data/RowType$LinkCase;", "Lcom/polymarket/data/RowType$RadioCase;", "Lcom/polymarket/data/RowType$SecondaryLeftCase;", "Lcom/polymarket/data/RowType$ToggleCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RowType implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: default, reason: not valid java name */
    private static final RowType f11default = new DefaultCase();
    private static final RowType secondaryLeft = new SecondaryLeftCase();
    private static final RowType link = new LinkCase();
    private static final RowType destructive = new DestructiveCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/RowType$DefaultCase;", "Lcom/polymarket/data/RowType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultCase extends RowType {
        public DefaultCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/RowType$DestructiveCase;", "Lcom/polymarket/data/RowType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DestructiveCase extends RowType {
        public DestructiveCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/RowType$LinkCase;", "Lcom/polymarket/data/RowType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LinkCase extends RowType {
        public LinkCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/polymarket/data/RowType$RadioCase;", "Lcom/polymarket/data/RowType;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "isSelected", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RadioCase extends RowType {
        private final boolean associated0;
        private final boolean isSelected;

        public RadioCase(boolean z) {
            super(null);
            this.associated0 = z;
            this.isSelected = z;
        }

        public final boolean getAssociated0() {
            return this.associated0;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/RowType$SecondaryLeftCase;", "Lcom/polymarket/data/RowType;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SecondaryLeftCase extends RowType {
        public SecondaryLeftCase() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/polymarket/data/RowType$ToggleCase;", "Lcom/polymarket/data/RowType;", "associated0", "Lkotlin/Function0;", "", "associated1", "Lkotlin/Function1;", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getAssociated0", "()Lkotlin/jvm/functions/Function0;", "getAssociated1", "()Lkotlin/jvm/functions/Function1;", "get", "getGet", "set", "getSet", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ToggleCase extends RowType {
        private final Function0<Boolean> associated0;
        private final Function1<Boolean, Unit> associated1;
        private final Function0<Boolean> get;
        private final Function1<Boolean, Unit> set;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ToggleCase(Function0<Boolean> function0, Function1<? super Boolean, Unit> function1) {
            super(null);
            function0.getClass();
            function1.getClass();
            this.associated0 = function0;
            this.associated1 = function1;
            this.get = function0;
            this.set = function1;
        }

        public final Function0<Boolean> getAssociated0() {
            return this.associated0;
        }

        public final Function1<Boolean, Unit> getAssociated1() {
            return this.associated1;
        }

        public final Function0<Boolean> getGet() {
            return this.get;
        }

        public final Function1<Boolean, Unit> getSet() {
            return this.set;
        }
    }

    public /* synthetic */ RowType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean Swift_isToggle(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ RowType access$getDefault$cp() {
        return f11default;
    }

    public static final /* synthetic */ RowType access$getDestructive$cp() {
        return destructive;
    }

    public static final /* synthetic */ RowType access$getLink$cp() {
        return link;
    }

    public static final /* synthetic */ RowType access$getSecondaryLeft$cp() {
        return secondaryLeft;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final boolean isToggle() {
        return Swift_isToggle(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00140\u0013J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/polymarket/data/RowType$Companion;", "", "<init>", "()V", "default", "Lcom/polymarket/data/RowType;", "getDefault", "()Lcom/polymarket/data/RowType;", "secondaryLeft", "getSecondaryLeft", ActionType.LINK, "getLink", "destructive", "getDestructive", "toggle", "get", "Lkotlin/Function0;", "", "set", "Lkotlin/Function1;", "", "radio", "isSelected", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RowType getDefault() {
            return RowType.access$getDefault$cp();
        }

        public final RowType getDestructive() {
            return RowType.access$getDestructive$cp();
        }

        public final RowType getLink() {
            return RowType.access$getLink$cp();
        }

        public final RowType getSecondaryLeft() {
            return RowType.access$getSecondaryLeft$cp();
        }

        public final RowType radio(boolean isSelected) {
            return new RadioCase(isSelected);
        }

        public final RowType toggle(Function0<Boolean> get, Function1<? super Boolean, Unit> set) {
            get.getClass();
            set.getClass();
            return new ToggleCase(get, set);
        }

        private Companion() {
        }
    }

    private RowType() {
    }
}
