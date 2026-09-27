package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.awd;
import defpackage.ax6;
import defpackage.bt9;
import defpackage.eb4;
import defpackage.f49;
import defpackage.fc7;
import defpackage.fd7;
import defpackage.g9b;
import defpackage.gx6;
import defpackage.h1i;
import defpackage.iqi;
import defpackage.j1i;
import defpackage.kib;
import defpackage.l84;
import defpackage.o8d;
import defpackage.s9i;
import defpackage.ttd;
import defpackage.ug7;
import defpackage.wdh;
import defpackage.ww4;
import defpackage.xc7;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.ErrorKt;
import skip.lib.GlobalsKt;
import skip.lib.Set;
import skip.lib.SetKt;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 !2\u00020\u0001:\u0003\"#!B;\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bB\u001b\b\u0012\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\b\u0012\u00060\u0001j\u0002`\u0011\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0012\u001a\u000e\u0012\b\u0012\u00060\u0001j\u0002`\u0011\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006$"}, d2 = {"Lskip/foundation/MarkdownNode;", "", "Lskip/foundation/MarkdownNode$NodeType;", "type", "", "string", "", "", "interpolationIndexes", "children", "<init>", "(Lskip/foundation/MarkdownNode$NodeType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Lo8d;", "node", "Lskip/foundation/MarkdownNode$InterpolationInfo;", "interpolationInfo", "(Lo8d;Lskip/foundation/MarkdownNode$InterpolationInfo;)V", "Lskip/lib/AnyHashable;", "interpolations", "format", "(Ljava/util/List;)Lskip/foundation/MarkdownNode;", "formattedString", "(Ljava/util/List;)Ljava/lang/String;", "Lskip/foundation/MarkdownNode$NodeType;", "getType", "()Lskip/foundation/MarkdownNode$NodeType;", "Ljava/lang/String;", "getString", "()Ljava/lang/String;", "Ljava/util/List;", "getInterpolationIndexes", "()Ljava/util/List;", "getChildren", "Companion", "NodeType", "InterpolationInfo", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarkdownNode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final awd parser;
    private final List<MarkdownNode> children;
    private final List<Integer> interpolationIndexes;
    private final String string;
    private final NodeType type;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0000¢\u0006\u0002\b\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lskip/foundation/MarkdownNode$InterpolationInfo;", "", "<init>", "()V", "index", "", "getIndex$SkipFoundation", "()I", "setIndex$SkipFoundation", "(I)V", "update", "", "for_", "", "update$SkipFoundation", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class InterpolationInfo {
        private int index;

        /* renamed from: getIndex$SkipFoundation, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final void setIndex$SkipFoundation(int i) {
            this.index = i;
        }

        public final void update$SkipFoundation(List<Integer> for_) {
            int i;
            if (for_ != null) {
                Integer valueOf = Integer.valueOf(this.index);
                Integer num = (Integer) CollectionsKt.W(for_);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                this.index = ((Number) GlobalsKt.max(valueOf, Integer.valueOf(i))).intValue();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [nk3, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.a = new ArrayList();
        obj.b = new ArrayList();
        obj.c = new ArrayList();
        obj.d = new ArrayList();
        obj.e = new ArrayList();
        obj.f = new HashSet();
        obj.g = gx6.v;
        obj.h = bt9.NONE;
        fd7 fd7Var = fd7.a;
        Objects.requireNonNull(fd7Var, "enabledBlockTypes must not be null");
        LinkedHashSet linkedHashSet = gx6.v;
        xc7.a.getClass();
        obj.g = fd7Var;
        List c = eb4.c(new Object());
        Objects.requireNonNull(c, "extensions must not be null");
        Iterator it = c.iterator();
        while (it.hasNext()) {
            if (((j1i) it.next()) instanceof j1i) {
                ((ArrayList) obj.c).add(new Object());
            }
        }
        parser = new awd(obj);
    }

    private MarkdownNode(o8d o8dVar, InterpolationInfo interpolationInfo) {
        iqi iqiVar;
        l84 l84Var;
        g9b g9bVar;
        if (o8dVar instanceof iqi) {
            iqiVar = (iqi) o8dVar;
        } else {
            iqiVar = null;
        }
        if (iqiVar != null) {
            this.type = NodeType.text;
            String str = iqiVar.g;
            str.getClass();
            Pair<String, List<Integer>> kotlinFormatInfo = skip.lib.StringKt.kotlinFormatInfo(str, interpolationInfo.getIndex(), true);
            String str2 = (String) kotlinFormatInfo.first;
            List<Integer> list = (List) kotlinFormatInfo.second;
            interpolationInfo.update$SkipFoundation(list);
            this.string = str2;
            this.interpolationIndexes = (List) StructKt.sref$default(list, null, 1, null);
            this.children = null;
            return;
        }
        if (o8dVar instanceof l84) {
            l84Var = (l84) o8dVar;
        } else {
            l84Var = null;
        }
        if (l84Var != null) {
            this.type = NodeType.code;
            String str3 = l84Var.g;
            str3.getClass();
            Pair<String, List<Integer>> kotlinFormatInfo2 = skip.lib.StringKt.kotlinFormatInfo(str3, interpolationInfo.getIndex(), true);
            String str4 = (String) kotlinFormatInfo2.first;
            List<Integer> list2 = (List) kotlinFormatInfo2.second;
            interpolationInfo.update$SkipFoundation(list2);
            this.string = str4;
            this.interpolationIndexes = (List) StructKt.sref$default(list2, null, 1, null);
            this.children = null;
            return;
        }
        if (o8dVar instanceof fc7) {
            this.type = NodeType.italic;
            this.string = null;
            this.interpolationIndexes = null;
            this.children = Companion.access$processChildren(INSTANCE, o8dVar, interpolationInfo);
            return;
        }
        if (o8dVar instanceof s9i) {
            this.type = NodeType.bold;
            this.string = null;
            this.interpolationIndexes = null;
            this.children = Companion.access$processChildren(INSTANCE, o8dVar, interpolationInfo);
            return;
        }
        if (o8dVar instanceof h1i) {
            this.type = NodeType.strikethrough;
            this.string = null;
            this.interpolationIndexes = null;
            this.children = Companion.access$processChildren(INSTANCE, o8dVar, interpolationInfo);
            return;
        }
        if (o8dVar instanceof g9b) {
            g9bVar = (g9b) o8dVar;
        } else {
            g9bVar = null;
        }
        if (g9bVar != null) {
            this.type = NodeType.link;
            this.children = Companion.access$processChildren(INSTANCE, o8dVar, interpolationInfo);
            String str5 = g9bVar.g;
            str5.getClass();
            Pair<String, List<Integer>> kotlinFormatInfo3 = skip.lib.StringKt.kotlinFormatInfo(str5, interpolationInfo.getIndex(), true);
            String str6 = (String) kotlinFormatInfo3.first;
            List<Integer> list3 = (List) kotlinFormatInfo3.second;
            interpolationInfo.update$SkipFoundation(list3);
            this.string = str6;
            this.interpolationIndexes = (List) StructKt.sref$default(list3, null, 1, null);
            return;
        }
        if (o8dVar instanceof ax6) {
            this.type = NodeType.root;
            this.string = null;
            this.interpolationIndexes = null;
            this.children = Companion.access$processChildren(INSTANCE, o8dVar, interpolationInfo);
            return;
        }
        if (o8dVar instanceof ttd) {
            this.type = NodeType.paragraph;
            this.string = null;
            this.interpolationIndexes = null;
            this.children = Companion.access$processChildren(INSTANCE, o8dVar, interpolationInfo);
            return;
        }
        if (!(o8dVar instanceof f49) && !(o8dVar instanceof wdh)) {
            this.type = NodeType.unknown;
            this.string = null;
            this.interpolationIndexes = null;
            this.children = Companion.access$processChildren(INSTANCE, o8dVar, interpolationInfo);
            return;
        }
        this.type = NodeType.text;
        this.string = "\n";
        this.interpolationIndexes = null;
        this.children = null;
    }

    public static final /* synthetic */ awd access$getParser$cp() {
        return parser;
    }

    public final MarkdownNode format(List<? extends Object> interpolations) {
        ArrayList arrayList;
        if (interpolations != null && !interpolations.isEmpty()) {
            String formattedString = formattedString(interpolations);
            NodeType nodeType = this.type;
            List<MarkdownNode> list = this.children;
            if (list != null) {
                List<MarkdownNode> list2 = list;
                arrayList = new ArrayList(CollectionsKt.w(list2));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MarkdownNode) it.next()).format(interpolations));
                }
            } else {
                arrayList = null;
            }
            return new MarkdownNode(nodeType, formattedString, (List<Integer>) null, arrayList);
        }
        return this;
    }

    public final String formattedString(List<? extends Object> interpolations) {
        String str = this.string;
        if (str != null && this.interpolationIndexes != null && interpolations != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) StructKt.sref$default(this.interpolationIndexes, null, 1, null)).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (interpolations.size() >= intValue) {
                    arrayList.add(interpolations.get(intValue - 1));
                }
            }
            String str2 = this.string;
            Object[] array = arrayList.toArray(new Object[0]);
            Object[] copyOf = Arrays.copyOf(array, array.length);
            return String.format(str2, Arrays.copyOf(copyOf, copyOf.length));
        }
        return str;
    }

    public final List<MarkdownNode> getChildren() {
        return this.children;
    }

    public final List<Integer> getInterpolationIndexes() {
        return this.interpolationIndexes;
    }

    public final String getString() {
        return this.string;
    }

    public final NodeType getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lskip/foundation/MarkdownNode$NodeType;", "", "<init>", "(Ljava/lang/String;I)V", "bold", ApiConstant.KEY_CODE, "italic", ActionType.LINK, "paragraph", "root", "strikethrough", "text", "unknown", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class NodeType {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ NodeType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Set<java.lang.Character> markdownCharacters;
        public static final NodeType bold = new NodeType("bold", 0);
        public static final NodeType code = new NodeType(ApiConstant.KEY_CODE, 1);
        public static final NodeType italic = new NodeType("italic", 2);
        public static final NodeType link = new NodeType(ActionType.LINK, 3);
        public static final NodeType paragraph = new NodeType("paragraph", 4);
        public static final NodeType root = new NodeType("root", 5);
        public static final NodeType strikethrough = new NodeType("strikethrough", 6);
        public static final NodeType text = new NodeType("text", 7);
        public static final NodeType unknown = new NodeType("unknown", 8);

        private static final /* synthetic */ NodeType[] $values() {
            return new NodeType[]{bold, code, italic, link, paragraph, root, strikethrough, text, unknown};
        }

        static {
            NodeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
            markdownCharacters = SetKt.setOf('*', '_', '`', '[', '~');
        }

        private NodeType(String str, int i) {
        }

        public static final /* synthetic */ Set access$getMarkdownCharacters$cp() {
            return markdownCharacters;
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static NodeType valueOf(String str) {
            return (NodeType) Enum.valueOf(NodeType.class, str);
        }

        public static NodeType[] values() {
            return (NodeType[]) $VALUES.clone();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lskip/foundation/MarkdownNode$NodeType$Companion;", "", "<init>", "()V", "Lo8d;", "node", "", "hasMarkdown$SkipFoundation", "(Lo8d;)Z", "hasMarkdown", "Lskip/lib/Set;", "", "markdownCharacters", "Lskip/lib/Set;", "getMarkdownCharacters$SkipFoundation", "()Lskip/lib/Set;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Set<java.lang.Character> getMarkdownCharacters$SkipFoundation() {
                return NodeType.access$getMarkdownCharacters$cp();
            }

            public final boolean hasMarkdown$SkipFoundation(o8d node) {
                if (node == null) {
                    return false;
                }
                if ((node instanceof s9i) || (node instanceof l84) || (node instanceof fc7) || (node instanceof g9b) || (node instanceof h1i)) {
                    return true;
                }
                for (o8d o8dVar = (o8d) StructKt.sref$default(node.b, null, 1, null); o8dVar != null; o8dVar = (o8d) StructKt.sref$default(o8dVar.e, null, 1, null)) {
                    if (hasMarkdown$SkipFoundation(o8dVar)) {
                        return true;
                    }
                }
                return false;
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lskip/foundation/MarkdownNode$Companion;", "", "<init>", "()V", "Lo8d;", "node", "Lskip/foundation/MarkdownNode$InterpolationInfo;", "interpolationInfo", "", "Lskip/foundation/MarkdownNode;", "processChildren", "(Lo8d;Lskip/foundation/MarkdownNode$InterpolationInfo;)Ljava/util/List;", "", "string", TicketDetailDestinationKt.LAUNCHED_FROM, "(Ljava/lang/String;)Lskip/foundation/MarkdownNode;", "Lawd;", "parser", "Lawd;", "getParser$SkipFoundation", "()Lawd;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ boolean a(char c) {
            return from$lambda$0(c);
        }

        public static final /* synthetic */ List access$processChildren(Companion companion, o8d o8dVar, InterpolationInfo interpolationInfo) {
            return companion.processChildren(o8dVar, interpolationInfo);
        }

        private static final boolean from$lambda$0(char c) {
            return NodeType.INSTANCE.getMarkdownCharacters$SkipFoundation().contains((Set<java.lang.Character>) java.lang.Character.valueOf(c));
        }

        private final List<MarkdownNode> processChildren(o8d node, InterpolationInfo interpolationInfo) {
            o8d o8dVar = (o8d) StructKt.sref$default(node.b, null, 1, null);
            if (o8dVar == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (o8dVar != null) {
                arrayList.add(new MarkdownNode(o8dVar, interpolationInfo, null));
                o8dVar = (o8d) StructKt.sref$default(o8dVar.e, null, 1, null);
            }
            return (List) StructKt.sref$default(arrayList, null, 1, null);
        }

        public final MarkdownNode from(String string) {
            if (string != null && string.length() != 0 && skip.lib.StringKt.contains(string, new kib(20))) {
                try {
                    ax6 ax6Var = (ax6) StructKt.sref$default(MarkdownNode.INSTANCE.getParser$SkipFoundation().a(string), null, 1, null);
                    if (ax6Var != null && NodeType.INSTANCE.hasMarkdown$SkipFoundation(ax6Var)) {
                        return new MarkdownNode(ax6Var, (InterpolationInfo) null, 2, (DefaultConstructorMarker) null);
                    }
                } catch (Throwable th) {
                    ErrorKt.aserror(th);
                }
            }
            return null;
        }

        public final awd getParser$SkipFoundation() {
            return MarkdownNode.access$getParser$cp();
        }

        private Companion() {
        }
    }

    private MarkdownNode(NodeType nodeType, String str, List<Integer> list, List<MarkdownNode> list2) {
        this.type = nodeType;
        this.string = str;
        this.interpolationIndexes = (List) StructKt.sref$default(list, null, 1, null);
        this.children = (List) StructKt.sref$default(list2, null, 1, null);
    }

    public /* synthetic */ MarkdownNode(o8d o8dVar, InterpolationInfo interpolationInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(o8dVar, interpolationInfo);
    }

    public /* synthetic */ MarkdownNode(o8d o8dVar, InterpolationInfo interpolationInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(o8dVar, (i & 2) != 0 ? new InterpolationInfo() : interpolationInfo);
    }
}
