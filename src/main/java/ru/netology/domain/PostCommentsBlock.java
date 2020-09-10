package ru.netology.domain;

public class PostCommentsBlock {
    private boolean buttonComment;
    private String buttonCommentImageUrl;
    private int countComment;
    private boolean buttonSendComment;
    private String imageButtonSendCommentUrl;
    private String textComment;
    private String numberOfViews;

    //    Лайки к комментариям
    private boolean likeComment;
    private String likeImageUrl;
    private int countLike;
    private String textLikes;
    private boolean buttonShareComment;
    private String buttonShareCommentImageUrl;
    private int authorLikeId;
    private String authorLikeUrl;
    private String authorLikeImageUrl;

    //    Кнопка пожаловаться в комментариях
    private boolean complain;
    private String complainImageUrl;

    //    Автор комментария
    private boolean authorId;
    private String authorUrl;
    private String authorImageUrl;

    //    + get/set на все поля

    // Блок "Запись на стене"
    private boolean id;
    private boolean ownerId;
    private boolean date;
    private boolean commentsInfo;
    private int commentCount;
    private boolean commentCanPost;
    private boolean commentCanClose;
    private boolean commentCanOpen;
    private boolean likesInfo;
    private int likeCount;
    private boolean canLike;
    private boolean canPublish;
    private boolean repostsInfo;
    private int repostCount;
    private boolean viewsInfo;
    private  int viewCount;
    private boolean markedAsAds;

}
