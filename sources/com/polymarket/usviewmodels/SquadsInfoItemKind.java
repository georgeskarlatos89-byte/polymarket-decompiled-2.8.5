package com.polymarket.usviewmodels;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/polymarket/usviewmodels/SquadsInfoItemKind;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "openToEveryone", "limitedNotifications", "deleteSquad", "editPermissions", "manageMembers", "customizeSquad", "messageInChat", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SquadsInfoItemKind implements SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ SquadsInfoItemKind[] $VALUES;
    public static final SquadsInfoItemKind openToEveryone = new SquadsInfoItemKind("openToEveryone", 0);
    public static final SquadsInfoItemKind limitedNotifications = new SquadsInfoItemKind("limitedNotifications", 1);
    public static final SquadsInfoItemKind deleteSquad = new SquadsInfoItemKind("deleteSquad", 2);
    public static final SquadsInfoItemKind editPermissions = new SquadsInfoItemKind("editPermissions", 3);
    public static final SquadsInfoItemKind manageMembers = new SquadsInfoItemKind("manageMembers", 4);
    public static final SquadsInfoItemKind customizeSquad = new SquadsInfoItemKind("customizeSquad", 5);
    public static final SquadsInfoItemKind messageInChat = new SquadsInfoItemKind("messageInChat", 6);

    private static final /* synthetic */ SquadsInfoItemKind[] $values() {
        return new SquadsInfoItemKind[]{openToEveryone, limitedNotifications, deleteSquad, editPermissions, manageMembers, customizeSquad, messageInChat};
    }

    static {
        SquadsInfoItemKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private SquadsInfoItemKind(String str, int i) {
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static SquadsInfoItemKind valueOf(String str) {
        return (SquadsInfoItemKind) Enum.valueOf(SquadsInfoItemKind.class, str);
    }

    public static SquadsInfoItemKind[] values() {
        return (SquadsInfoItemKind[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }
}
