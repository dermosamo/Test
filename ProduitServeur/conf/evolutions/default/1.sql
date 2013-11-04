# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tweet (
  id                        bigint not null,
  commentaire               varchar(255),
  username                  varchar(255),
  creation_date             timestamp,
  constraint pk_tweet primary key (id))
;

create sequence tweet_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists tweet;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists tweet_seq;

