package com.sevanjoe.v2ex.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sevan on 2015/11/18.
 */
public class Topic implements Parcelable {
    /**
     * id : 237001
     * title : 找了个女朋友后感觉没时间看书写代码了，怎么办
     * url : http://www.v2ex.com/t/237001
     * content : 最近找了个小女朋友，比我小四岁，性格开朗话特别多。 然后就是，感觉每天都要花好多时间在女朋友身上，没时间看书撸代码了，怎么办呢， 怎么平衡
     * content_rendered : 最近找了个小女朋友，比我小四岁，性格开朗话特别多。 <br />然后就是，感觉每天都要花好多时间在女朋友身上，没时间看书撸代码了，怎么办呢， <br />怎么平衡
     * replies : 145
     * member : {"id":86739,"username":"Euray","tagline":"","avatar_mini":"//cdn.v2ex.co/avatar/debf/fe3e/86739_mini.png?m=1445397431","avatar_normal":"//cdn.v2ex.co/avatar/debf/fe3e/86739_normal.png?m=1445397431","avatar_large":"//cdn.v2ex.co/avatar/debf/fe3e/86739_large.png?m=1445397431"}
     * node : {"id":12,"name":"qna","title":"问与答","title_alternative":"Questions and Answers","url":"http://www.v2ex.com/go/qna","topics":59837,"avatar_mini":"//cdn.v2ex.co/navatar/c20a/d4d7/12_mini.png?m=1447186349","avatar_normal":"//cdn.v2ex.co/navatar/c20a/d4d7/12_normal.png?m=1447186349","avatar_large":"//cdn.v2ex.co/navatar/c20a/d4d7/12_large.png?m=1447186349"}
     * created : 1447819199
     * last_modified : 1447819411
     * last_touched : 1447857055
     */

    private int id;
    private String title;
    private String url;
    private String content;
    private String content_rendered;
    private int replies;
    /**
     * id : 86739
     * username : Euray
     * tagline :
     * avatar_mini : //cdn.v2ex.co/avatar/debf/fe3e/86739_mini.png?m=1445397431
     * avatar_normal : //cdn.v2ex.co/avatar/debf/fe3e/86739_normal.png?m=1445397431
     * avatar_large : //cdn.v2ex.co/avatar/debf/fe3e/86739_large.png?m=1445397431
     */

    private Member member;
    /**
     * id : 12
     * name : qna
     * title : 问与答
     * title_alternative : Questions and Answers
     * url : http://www.v2ex.com/go/qna
     * topics : 59837
     * avatar_mini : //cdn.v2ex.co/navatar/c20a/d4d7/12_mini.png?m=1447186349
     * avatar_normal : //cdn.v2ex.co/navatar/c20a/d4d7/12_normal.png?m=1447186349
     * avatar_large : //cdn.v2ex.co/navatar/c20a/d4d7/12_large.png?m=1447186349
     */

    private Node node;
    private int created;
    private int last_modified;
    private int last_touched;

    protected Topic(Parcel in) {
        id = in.readInt();
        title = in.readString();
        url = in.readString();
        content = in.readString();
        content_rendered = in.readString();
        replies = in.readInt();
        created = in.readInt();
        last_modified = in.readInt();
        last_touched = in.readInt();
    }

    public static final Creator<Topic> CREATOR = new Creator<Topic>() {
        @Override
        public Topic createFromParcel(Parcel in) {
            return new Topic(in);
        }

        @Override
        public Topic[] newArray(int size) {
            return new Topic[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_rendered() {
        return content_rendered;
    }

    public void setContent_rendered(String content_rendered) {
        this.content_rendered = content_rendered;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(int last_modified) {
        this.last_modified = last_modified;
    }

    public int getLast_touched() {
        return last_touched;
    }

    public void setLast_touched(int last_touched) {
        this.last_touched = last_touched;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(url);
        dest.writeString(content);
        dest.writeString(content_rendered);
        dest.writeInt(replies);
        dest.writeInt(created);
        dest.writeInt(last_modified);
        dest.writeInt(last_touched);
    }
}
