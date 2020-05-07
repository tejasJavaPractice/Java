package com.jpa.annotation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "instructor_detail")
@Setter
@Getter
public class InstructorDetail 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    @Column(name = "hobby")
    private String hobby;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;

    public InstructorDetail() 
    {

    }

    public InstructorDetail(String youtubeChannel, String hobby) 
    {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby;
    }

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby
				+ ", instructor=" + instructor + "]";
	}
    
    
}