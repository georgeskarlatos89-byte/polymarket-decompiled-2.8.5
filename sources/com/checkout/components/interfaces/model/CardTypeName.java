package com.checkout.components.interfaces.model;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.l83;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00072\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName;", "", "Charge", "Credit", "Debit", "DeferredDebit", "Prepaid", "Companion", "Lcom/checkout/components/interfaces/model/CardTypeName$Charge;", "Lcom/checkout/components/interfaces/model/CardTypeName$Credit;", "Lcom/checkout/components/interfaces/model/CardTypeName$Debit;", "Lcom/checkout/components/interfaces/model/CardTypeName$DeferredDebit;", "Lcom/checkout/components/interfaces/model/CardTypeName$Prepaid;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CardTypeName {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Charge;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Charge implements CardTypeName {
        public static final int $stable = 0;
        public static final Charge INSTANCE = new Charge();

        private Charge() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Companion;", "", "", Keys.KEY_NAME, "Lcom/checkout/components/interfaces/model/CardTypeName;", "fromString", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/CardTypeName;", "", "b", "Lkotlin/Lazy;", "getEntries", "()Ljava/util/List;", "entries", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        /* renamed from: b, reason: from kotlin metadata */
        private static final Lazy entries = LazyKt.lazy(new l83(6));

        private Companion() {
        }

        private static final List a() {
            return CollectionsKt.listOf(Charge.INSTANCE, Credit.INSTANCE, Debit.INSTANCE, DeferredDebit.INSTANCE, Prepaid.INSTANCE);
        }

        public static /* synthetic */ List b() {
            return a();
        }

        public final CardTypeName fromString(String name) {
            String str;
            if (name != null) {
                str = name.toUpperCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -189311892:
                    if (!str.equals("DEFERRED_DEBIT")) {
                        return null;
                    }
                    return DeferredDebit.INSTANCE;
                case 64920780:
                    if (!str.equals("DEBIT")) {
                        return null;
                    }
                    return Debit.INSTANCE;
                case 399611855:
                    if (!str.equals("PREPAID")) {
                        return null;
                    }
                    return Prepaid.INSTANCE;
                case 1986664116:
                    if (!str.equals("CHARGE")) {
                        return null;
                    }
                    return Charge.INSTANCE;
                case 1996005113:
                    if (!str.equals("CREDIT")) {
                        return null;
                    }
                    return Credit.INSTANCE;
                default:
                    return null;
            }
        }

        public final List<CardTypeName> getEntries() {
            return (List) entries.getValue();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Credit;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Credit implements CardTypeName {
        public static final int $stable = 0;
        public static final Credit INSTANCE = new Credit();

        private Credit() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Debit;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Debit implements CardTypeName {
        public static final int $stable = 0;
        public static final Debit INSTANCE = new Debit();

        private Debit() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$DeferredDebit;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DeferredDebit implements CardTypeName {
        public static final int $stable = 0;
        public static final DeferredDebit INSTANCE = new DeferredDebit();

        private DeferredDebit() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/CardTypeName$Prepaid;", "Lcom/checkout/components/interfaces/model/CardTypeName;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Prepaid implements CardTypeName {
        public static final int $stable = 0;
        public static final Prepaid INSTANCE = new Prepaid();

        private Prepaid() {
        }
    }
}
